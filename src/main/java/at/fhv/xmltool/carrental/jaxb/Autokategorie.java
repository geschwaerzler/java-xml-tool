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
    "autotyp"
})
@XmlRootElement(name = "autokategorie")
public class Autokategorie {

    @XmlAttribute(name = "kategorie_bezeichnung", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String kategorieBezeichnung;
    @XmlAttribute(name = "grundtarif", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String grundtarif;
    @XmlAttribute(name = "km_preis", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String kmPreis;
    protected List<Autotyp> autotyp;

    /**
     * Ruft den Wert der kategorieBezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategorieBezeichnung() {
        return kategorieBezeichnung;
    }

    /**
     * Legt den Wert der kategorieBezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategorieBezeichnung(String value) {
        this.kategorieBezeichnung = value;
    }

    /**
     * Ruft den Wert der grundtarif-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrundtarif() {
        return grundtarif;
    }

    /**
     * Legt den Wert der grundtarif-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrundtarif(String value) {
        this.grundtarif = value;
    }

    /**
     * Ruft den Wert der kmPreis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKmPreis() {
        return kmPreis;
    }

    /**
     * Legt den Wert der kmPreis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKmPreis(String value) {
        this.kmPreis = value;
    }

    /**
     * Gets the value of the autotyp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autotyp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutotyp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Autotyp }
     * 
     * 
     */
    public List<Autotyp> getAutotyp() {
        if (autotyp == null) {
            autotyp = new ArrayList<Autotyp>();
        }
        return this.autotyp;
    }

}
