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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
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
    "verfuegtUeber"
})
@XmlRootElement(name = "auto")
public class Auto {

    @XmlAttribute(name = "kennzeichen", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String kennzeichen;
    @XmlAttribute(name = "autotyp-id", required = true)
    @XmlIDREF
    protected Object autotypId;
    @XmlAttribute(name = "vermiet-station-id", required = true)
    @XmlIDREF
    protected Object vermietStationId;
    @XmlAttribute(name = "km_stand", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String kmStand;
    @XmlAttribute(name = "farbe", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String farbe;
    @XmlAttribute(name = "image")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String image;
    @XmlElement(name = "verfuegt_ueber")
    protected List<VerfuegtUeber> verfuegtUeber;

    /**
     * Ruft den Wert der kennzeichen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKennzeichen() {
        return kennzeichen;
    }

    /**
     * Legt den Wert der kennzeichen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKennzeichen(String value) {
        this.kennzeichen = value;
    }

    /**
     * Ruft den Wert der autotypId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAutotypId() {
        return autotypId;
    }

    /**
     * Legt den Wert der autotypId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAutotypId(Object value) {
        this.autotypId = value;
    }

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
     * Ruft den Wert der kmStand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmStand() {
        return kmStand;
    }

    /**
     * Legt den Wert der kmStand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmStand(String value) {
        this.kmStand = value;
    }

    /**
     * Ruft den Wert der farbe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarbe() {
        return farbe;
    }

    /**
     * Legt den Wert der farbe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarbe(String value) {
        this.farbe = value;
    }

    /**
     * Ruft den Wert der image-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Legt den Wert der image-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Gets the value of the verfuegtUeber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verfuegtUeber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerfuegtUeber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerfuegtUeber }
     * 
     * 
     */
    public List<VerfuegtUeber> getVerfuegtUeber() {
        if (verfuegtUeber == null) {
            verfuegtUeber = new ArrayList<VerfuegtUeber>();
        }
        return this.verfuegtUeber;
    }

}
