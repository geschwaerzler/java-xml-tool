# java-xml-tool
This java project illustrates the use of XML APIs provided by Java:
* parse and validate XML documents,
* performe XSL-Transformations
* populate a database using JPA from a XML source.

## Requirements
* JDK 1.8
* The java project management tool _maven_, (I use version 3.5.2): [Maven](https://maven.apache.org/)
* software version control: git
* optional, for the CarRental Example: Postgres

## Installation
1. Change into the directory where your software project live: eg  
`cd ~/Developer`
1. download - or better clone - the repository "java-xml-tool"  
`git clone https://github.com/geschwaerzler/java-xml-tool.git`
1. change directory into "java-xml-tool". This directory has been created by the git clone in the previous step.  
`cd java-xml-tool`
1. compile and build the java tool "XMLTool"  
`mvn package`
1. Test the build, by calling the tool without arguments:  
`java -jar target/XMLTool.jar`  
you should see the following output.


```  
usage:  
	parse xmlfile  
	validate schemafile xmlfile  
	transform xsltfile inputfile outputfile  
	derby jdbcUrl sqlfile  
	load xmlfile  
```

**Congratulations**, you just have successfully built your own, simple XML IDE!

## Using XMLTool

### Validating XML files against XSDs and DTDs
There are two levels of sytactic validity of XML documents. **Well-formed** XML document obey the general conventions. All XML docuents **must** be well-formed in order to be processed by a parser. In addition, you may impose strucural rules to a XML documents by supplying DTDs (document type definitions) or XSDs (XML Schema Language Definintions). In this case, we call the XML document **valid** against that DTD or XSD. 

XMLTool implements the following commands:
* check, if the file xml/addresses.xml is *well-formed*:  
`java -jar target/XMLTool.jar parse xml/addresses.xml`
* *validate* file xml/addresses.xml against the schema definition xml/addressbook.xsd  
`java -jar target/XMLTool.jar validate src/main/resources/addressbook.xsd xml/addresses.xml`
* or *validate* file xml/car-rental.xml against the document type definition xml/car-rental.dtd  
`java -jar target/XMLTool.jar validate src/main/resources/car-rental.dtd xml/car-rental.xml`

### Transforming XML files with XSLT
XML stylesheet language transformations (XSLT) allow you to convert a given XML structure into another one. The conversion is specified (or let's say programmed) by a so called *stylesheet*, which is itself a XML document of type XSLT (file-extension .xsl). You may perform a XSL tarsnformation with XSLTool by issueing:

`java -jar target/XMLTool.jar transform xml/addresses2html.xsl xml/addresses.xml xml/addresses.html`

where the resulting file xml/addresses.html will be created or overwritten. Or alternatively:

`java -jar target/XMLTool.jar transform xml/car-rental2html.xsl xml/car-rental.xml xml/car-rental.html`

### Load XML Data into Database

#### Addresses
This exmaple illustrates JPA and JAXB APIs using a very simple address book data structure. First, a JAXB DOM is loaded from a XML file.This DOM then is manipulated by adding another address and finally the DOM is traversed (iterated) and stored to the database.

1. Create derby database "addresses"  
`java -jar target/XMLTool.jar derby 'jdbc:derby:derby.data/addresses;create=true' db/createDbAddresses.sql`
1. Load XML file "addresses.xml" into database addresses  
`java -jar target/XMLTool.jar load xml/addresses.xml`
1. List the database content:  
`java -jar target/XMLTool.jar derby 'jdbc:derby:derby.data/addresses' db/listAddresses.sql`

#### Messages2
Have a look at the source code of scr/main/java/at/fhv/xmltool/Addresses.java. See, how the XML dom-tree is traversed and JPA objects are built and persisted. scr/main/java/at/fhv/xmltool/Messages2.java is a skeletton, that needs only one or two dozens of code lines in order to load the messages2 DB! Try it yourself. 

1. Create derby database "messages2"  
`java -jar target/XMLTool.jar derby 'jdbc:derby:derby.data/messages2;create=true' db/createDbMessages2.sql`
1. Load XML file "messages2.xml" into database messages2  
`java -jar target/XMLTool.jar load xml/messages2.xml`
1. List the database content:  
`java -jar target/XMLTool.jar derby 'jdbc:derby:derby.data/messages2;create=true' db/listMessages2.sql`

#### CarRental
This example requires a running PostgreSQL DBMS on your system and access to the postgres command line tools.

1. Create postgres database "CarRental"  
`psql -f db/createDbCarRental.sql CarRental`
1. Load XML file "messages2.xml" into database messages2  
`java -jar target/XMLTool.jar load xml/car-rental.xml`  
1. List the database content:  
`psql -f db/listCarRental.sql CarRental`

### (Re-)Generate JPA-Classes with [Hibernate-Tool](http://hibernate.org/tools/) Reengineering

* Re-(generate) at.fhv.xmltool.addressbook.jpa.* classes:  
`mvn antrun:run@addresses2java`
* Re-(generate) at.fhv.xmltool.message2.jpa.* classes:  
`mvn antrun:run@messages2java`
* Re-(generate) at.fhv.xmltool.carrental.jpa.* classes:  
`mvn antrun:run@carRental2java`
