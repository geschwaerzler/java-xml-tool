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
@XmlType(name = "", propOrder = {
    "mietvertrag"
})
@XmlRootElement(name = "reservierung")
public class Reservierung {

    @XmlAttribute(name = "vermiet-station-id", required = true)
    @XmlIDREF
    protected Object vermietStationId;
    @XmlAttribute(name = "reservierungs_nr", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reservierungsNr;
    @XmlAttribute(name = "anfangsdatum", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String anfangsdatum;
    @XmlAttribute(name = "enddatum", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String enddatum;
    @XmlAttribute(name = "kategorie_bezeichnung", required = true)
    @XmlIDREF
    protected Object kategorieBezeichnung;
    protected Mietvertrag mietvertrag;

    /**
     * Ruft den Wert der vermietStationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVermietStationId() {
        return vermietStationId;
    }

    /**
     * Legt den Wert der vermietStationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVermietStationId(Object value) {
        this.vermietStationId = value;
    }

    /**
     * Ruft den Wert der reservierungsNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservierungsNr() {
        return reservierungsNr;
    }

    /**
     * Legt den Wert der reservierungsNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservierungsNr(String value) {
        this.reservierungsNr = value;
    }

    /**
     * Ruft den Wert der anfangsdatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnfangsdatum() {
        return anfangsdatum;
    }

    /**
     * Legt den Wert der anfangsdatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnfangsdatum(String value) {
        this.anfangsdatum = value;
    }

    /**
     * Ruft den Wert der enddatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnddatum() {
        return enddatum;
    }

    /**
     * Legt den Wert der enddatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnddatum(String value) {
        this.enddatum = value;
    }

    /**
     * Ruft den Wert der kategorieBezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKategorieBezeichnung() {
        return kategorieBezeichnung;
    }

    /**
     * Legt den Wert der kategorieBezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKategorieBezeichnung(Object value) {
        this.kategorieBezeichnung = value;
    }

    /**
     * Ruft den Wert der mietvertrag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Mietvertrag }
     *     
     */
    public Mietvertrag getMietvertrag() {
        return mietvertrag;
    }

    /**
     * Legt den Wert der mietvertrag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Mietvertrag }
     *     
     */
    public void setMietvertrag(Mietvertrag value) {
        this.mietvertrag = value;
    }

}
