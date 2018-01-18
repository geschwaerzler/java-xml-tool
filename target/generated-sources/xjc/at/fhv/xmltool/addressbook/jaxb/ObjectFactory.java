//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.18 um 11:05:38 AM CET 
//


package at.fhv.xmltool.addressbook.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.fhv.xmltool.addressbook.jaxb package. 
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

    private final static QName _Addressbook_QNAME = new QName("http://xmllab.fhv.at/addressbook", "addressbook");
    private final static QName _Address_QNAME = new QName("http://xmllab.fhv.at/addressbook", "address");
    private final static QName _Person_QNAME = new QName("http://xmllab.fhv.at/addressbook", "person");
    private final static QName _Firstname_QNAME = new QName("http://xmllab.fhv.at/addressbook", "firstname");
    private final static QName _Lastname_QNAME = new QName("http://xmllab.fhv.at/addressbook", "lastname");
    private final static QName _Street_QNAME = new QName("http://xmllab.fhv.at/addressbook", "street");
    private final static QName _Zip_QNAME = new QName("http://xmllab.fhv.at/addressbook", "zip");
    private final static QName _City_QNAME = new QName("http://xmllab.fhv.at/addressbook", "city");
    private final static QName _Country_QNAME = new QName("http://xmllab.fhv.at/addressbook", "country");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.fhv.xmltool.addressbook.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBAddressbookType }
     * 
     */
    public JAXBAddressbookType createJAXBAddressbookType() {
        return new JAXBAddressbookType();
    }

    /**
     * Create an instance of {@link JAXBAddressType }
     * 
     */
    public JAXBAddressType createJAXBAddressType() {
        return new JAXBAddressType();
    }

    /**
     * Create an instance of {@link JAXBPersonType }
     * 
     */
    public JAXBPersonType createJAXBPersonType() {
        return new JAXBPersonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBAddressbookType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/addressbook", name = "addressbook")
    public JAXBElement<JAXBAddressbookType> createAddressbook(JAXBAddressbookType value) {
        return new JAXBElement<JAXBAddressbookType>(_Addressbook_QNAME, JAXBAddressbookType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/addressbook", name = "address")
    public JAXBElement<JAXBAddressType> createAddress(JAXBAddressType value) {
        return new JAXBElement<JAXBAddressType>(_Address_QNAME, JAXBAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/addressbook", name = "person")
    public JAXBElement<JAXBPersonType> createPerson(JAXBPersonType value) {
        return new JAXBElement<JAXBPersonType>(_Person_QNAME, JAXBPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/addressbook", name = "firstname")
    public JAXBElement<String> createFirstname(String value) {
        return new JAXBElement<String>(_Firstname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/addressbook", name = "lastname")
    public JAXBElement<String> createLastname(String value) {
        return new JAXBElement<String>(_Lastname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/addressbook", name = "street")
    public JAXBElement<String> createStreet(String value) {
        return new JAXBElement<String>(_Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/addressbook", name = "zip")
    public JAXBElement<String> createZip(String value) {
        return new JAXBElement<String>(_Zip_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/addressbook", name = "city")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmllab.fhv.at/addressbook", name = "country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

}
