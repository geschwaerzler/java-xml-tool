package at.fhv.xmltool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import at.fhv.xmltool.addressbook.jaxb.JAXBAddressbookType;
import at.fhv.xmltool.messages2.jaxb.JAXBMessageListType;

public class XML {
	@SuppressWarnings("serial")

	private static class CommandSytaxException extends java.lang.Exception {};

	static String ADDRESSES_JDBC_URL="jdbc:derby:derby.data/addresses";

    public static void main( String[] args ) {
		try {
		    if (args.length == 0) throw new CommandSytaxException();
		    String command = args[0];
			if ("parse".equals(command) && args.length == 2) {
				parse(args[1]);
				System.out.println(args[1] + " parsed successfully");
			} else if ("validate".equals(command) && args.length == 3) {
				validate(args[1], args[2]);
				System.out.println(args[2] + " is valid against " + args[1]);
			} else if ("transform".equals(command) && args.length == 4) {
				transform(args[1], args[2], args[3]);
			} else if ("derby".equals(command) && args.length == 3) {
				derby(args[1], args[2]);
			} else if ("load".equals(command) && args.length == 2) {
				load(args[1]);
			} else {
				throw new CommandSytaxException();
			}
		} catch (CommandSytaxException e) {
			System.out.println("usage:");
			System.out.println("\tparse xmlfile");
			System.out.println("\tvalidate schemafile xmlfile");
			System.out.println("\ttransform xsltfile inputfile outputfile");
			System.out.println("\tderby jdbcUrl sqlfile");
			System.out.println("\tload xmlfile");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }

    static void parse(String xmlPath) throws ParserConfigurationException, SAXException, IOException {
        // parse an XML document into a DOM tree
        DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        //we don't do anything with the parsed DOM tree. We just parse it to check wellformedness
        parser.parse(new File(xmlPath));
    }
    
    static void validate(String xsdPath, String xmlPath)
    	throws SAXException, IOException, ParserConfigurationException {
		if (xsdPath.endsWith(".dtd")) {
			System.out.println("NOTE: The DTD file used will be derived from the DOCTYPE declaration!");
	        // parse the XML document into a DOM tree with validation activated
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(true);
	        DocumentBuilder parser = factory.newDocumentBuilder();
	        //we don't do anything with the parsed DOM tree. We just parse it to check wellformedness and validity
	        parser.parse(new File(xmlPath));
		} else {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	        Schema schema = factory.newSchema(new File(xsdPath));
	        Validator validator = schema.newValidator();
	        validator.validate(new StreamSource(new File(xmlPath)));
		}
    }

	static void transform(String xsltPath, String inPath, String outPath)
	throws ParserConfigurationException, SAXException, IOException, TransformerException {
		File xsltFile = new File(xsltPath);
		File inFile = new File(inPath);
		File outFile = new File(outPath);

        DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document document = parser.parse(inFile);

		// Use a Transformer for output
		StreamSource xsltSource = new StreamSource(xsltFile);
		Transformer transformer = TransformerFactory
			.newInstance("net.sf.saxon.TransformerFactoryImpl", null)
			.newTransformer(xsltSource);

		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(outFile);
		transformer.transform(source, result);
	}

	static void derby(String jdbcUrl, String initScriptPath)
	throws SQLException, UnsupportedEncodingException, FileNotFoundException {
		Connection conn = DriverManager.getConnection(jdbcUrl);
		org.apache.derby.tools.ij.runScript(
			conn,
			new FileInputStream(initScriptPath), StandardCharsets.UTF_8.name(),
			System.out, StandardCharsets.UTF_8.name()
		);
	}

	static void load(String xmlPath) {
		try {
			File xmlFile = new File(xmlPath);
			StreamSource xmlSource = new StreamSource(xmlFile);

			JAXBContext context = JAXBContext.newInstance("at.fhv.xmltool.addressbook.jaxb:at.fhv.xmltool.messages2.jaxb");
			Unmarshaller um = context.createUnmarshaller();
			JAXBElement<?> rootElem = (JAXBElement<?>)um.unmarshal(xmlSource);

			//output to console
			System.out.println("load: " + xmlPath + " successfully unmarshalled to JAXB:");
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(rootElem, System.out);

			if (rootElem.getDeclaredType() == JAXBAddressbookType.class) {
				JAXBAddressbookType addressbook = (JAXBAddressbookType)rootElem.getValue();

				Addresses.addSomeAddress(addressbook);

				//output to console
				System.out.println("load: Donald successfully added:");
				m.marshal(rootElem, System.out);

				Addresses.load( (JAXBAddressbookType)rootElem.getValue() );
			} else if (rootElem.getDeclaredType() == JAXBMessageListType.class) {
				Messages2.load( (JAXBMessageListType)rootElem.getValue() );
			}

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
 
}
