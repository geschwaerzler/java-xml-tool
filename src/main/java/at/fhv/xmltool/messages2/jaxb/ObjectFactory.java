//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.18 um 11:05:38 AM CET 
//


package at.fhv.xmltool.messages2.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.fhv.xmltool.messages2.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Messages_QNAME = new QName("http://xmllab.fhv.at/messages2", "messages");
    private final static QName _Message_QNAME = new QName("http://xmllab.fhv.at/messages2", "message");
    private final static QName _Text_QNAME = new QName("http://xmllab.fhv.at/messages2", "text");
    private final static QName _InReplyTo_QNAME = new QName("http://xmllab.fhv.at/messages2", "in-reply-to");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.fhv.xmltool.messages2.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBMessageListType }
     * 
     */
    public JAXBMessageListType createJAXBMessageListType() {
        return new JAXBMessageListType();
    }

    /**
     * Create an instance of {@link JAXBMessageType }
     * 
     */
    public JAXBMessageType createJAXBMessageType() {
        return new JAXBMessageType();
    }

    /**
     * Create an instance of {@link JAXBInReplyToType }
     * 
     */
    public JAXBInReplyToType createJAXBInReplyToType() {
        return new JAXBInReplyToType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBMessageListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/messages2", name = "messages")
    public JAXBElement<JAXBMessageListType> createMessages(JAXBMessageListType value) {
        return new JAXBElement<JAXBMessageListType>(_Messages_QNAME, JAXBMessageListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/messages2", name = "message")
    public JAXBElement<JAXBMessageType> createMessage(JAXBMessageType value) {
        return new JAXBElement<JAXBMessageType>(_Message_QNAME, JAXBMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/messages2", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBInReplyToType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/messages2", name = "in-reply-to")
    public JAXBElement<JAXBInReplyToType> createInReplyTo(JAXBInReplyToType value) {
        return new JAXBElement<JAXBInReplyToType>(_InReplyTo_QNAME, JAXBInReplyToType.class, null, value);
    }

}
