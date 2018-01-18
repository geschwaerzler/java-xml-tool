//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.18 um 11:05:38 AM CET 
//


package at.fhv.xmltool.carrental.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservierung"
})
@XmlRootElement(name = "kunde")
public class Kunde {

    @XmlAttribute(name = "fuehrerschein_nummer", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String fuehrerscheinNummer;
    @XmlAttribute(name = "kunde_name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String kundeName;
    @XmlAttribute(name = "anschrift", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String anschrift;
    protected List<Reservierung> reservierung;

    /**
     * Ruft den Wert der fuehrerscheinNummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuehrerscheinNummer() {
        return fuehrerscheinNummer;
    }

    /**
     * Legt den Wert der fuehrerscheinNummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuehrerscheinNummer(String value) {
        this.fuehrerscheinNummer = value;
    }

    /**
     * Ruft den Wert der kundeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKundeName() {
        return kundeName;
    }

    /**
     * Legt den Wert der kundeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKundeName(String value) {
        this.kundeName = value;
    }

    /**
     * Ruft den Wert der anschrift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnschrift() {
        return anschrift;
    }

    /**
     * Legt den Wert der anschrift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnschrift(String value) {
        this.anschrift = value;
    }

    /**
     * Gets the value of the reservierung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservierung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservierung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservierung }
     * 
     * 
     */
    public List<Reservierung> getReservierung() {
        if (reservierung == null) {
            reservierung = new ArrayList<Reservierung>();
        }
        return this.reservierung;
    }

}
