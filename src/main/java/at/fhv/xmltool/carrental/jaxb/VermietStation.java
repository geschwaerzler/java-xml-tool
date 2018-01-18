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
@XmlType(name = "")
@XmlRootElement(name = "vermiet-station")
public class VermietStation {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "stations_name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stationsName;
    @XmlAttribute(name = "adresse", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String adresse;
    @XmlAttribute(name = "mitarbeiter_anzahl", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mitarbeiterAnzahl;
    @XmlAttribute(name = "geoeffnet_von")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String geoeffnetVon;
    @XmlAttribute(name = "geoeffnet_bis")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String geoeffnetBis;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der stationsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationsName() {
        return stationsName;
    }

    /**
     * Legt den Wert der stationsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationsName(String value) {
        this.stationsName = value;
    }

    /**
     * Ruft den Wert der adresse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Legt den Wert der adresse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresse(String value) {
        this.adresse = value;
    }

    /**
     * Ruft den Wert der mitarbeiterAnzahl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMitarbeiterAnzahl() {
        return mitarbeiterAnzahl;
    }

    /**
     * Legt den Wert der mitarbeiterAnzahl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMitarbeiterAnzahl(String value) {
        this.mitarbeiterAnzahl = value;
    }

    /**
     * Ruft den Wert der geoeffnetVon-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoeffnetVon() {
        return geoeffnetVon;
    }

    /**
     * Legt den Wert der geoeffnetVon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoeffnetVon(String value) {
        this.geoeffnetVon = value;
    }

    /**
     * Ruft den Wert der geoeffnetBis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoeffnetBis() {
        return geoeffnetBis;
    }

    /**
     * Legt den Wert der geoeffnetBis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoeffnetBis(String value) {
        this.geoeffnetBis = value;
    }

}
