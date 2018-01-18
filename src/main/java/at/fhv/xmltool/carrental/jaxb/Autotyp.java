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
    "extraausstattung"
})
@XmlRootElement(name = "autotyp")
public class Autotyp {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "typ_bezeichnung", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String typBezeichnung;
    @XmlAttribute(name = "benzinverbrauch", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String benzinverbrauch;
    protected List<Extraausstattung> extraausstattung;

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
     * Ruft den Wert der typBezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypBezeichnung() {
        return typBezeichnung;
    }

    /**
     * Legt den Wert der typBezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypBezeichnung(String value) {
        this.typBezeichnung = value;
    }

    /**
     * Ruft den Wert der benzinverbrauch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenzinverbrauch() {
        return benzinverbrauch;
    }

    /**
     * Legt den Wert der benzinverbrauch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenzinverbrauch(String value) {
        this.benzinverbrauch = value;
    }

    /**
     * Gets the value of the extraausstattung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraausstattung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraausstattung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extraausstattung }
     * 
     * 
     */
    public List<Extraausstattung> getExtraausstattung() {
        if (extraausstattung == null) {
            extraausstattung = new ArrayList<Extraausstattung>();
        }
        return this.extraausstattung;
    }

}
