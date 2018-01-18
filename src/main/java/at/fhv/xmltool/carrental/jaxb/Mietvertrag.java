//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.01.18 um 11:05:38 AM CET 
//


package at.fhv.xmltool.carrental.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "mietvertrag")
public class Mietvertrag {

    @XmlAttribute(name = "kennzeichen", required = true)
    @XmlIDREF
    protected Object kennzeichen;
    @XmlAttribute(name = "km_stand_uebergabe", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String kmStandUebergabe;
    @XmlAttribute(name = "km_stand_rueckgabe")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String kmStandRueckgabe;

    /**
     * Ruft den Wert der kennzeichen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKennzeichen() {
        return kennzeichen;
    }

    /**
     * Legt den Wert der kennzeichen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKennzeichen(Object value) {
        this.kennzeichen = value;
    }

    /**
     * Ruft den Wert der kmStandUebergabe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmStandUebergabe() {
        return kmStandUebergabe;
    }

    /**
     * Legt den Wert der kmStandUebergabe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmStandUebergabe(String value) {
        this.kmStandUebergabe = value;
    }

    /**
     * Ruft den Wert der kmStandRueckgabe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmStandRueckgabe() {
        return kmStandRueckgabe;
    }

    /**
     * Legt den Wert der kmStandRueckgabe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmStandRueckgabe(String value) {
        this.kmStandRueckgabe = value;
    }

}
