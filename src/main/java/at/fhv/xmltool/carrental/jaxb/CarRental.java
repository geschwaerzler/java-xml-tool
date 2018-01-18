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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stadt",
    "autokategorie",
    "auto",
    "kunde"
})
@XmlRootElement(name = "car-rental")
public class CarRental {

    protected List<Stadt> stadt;
    protected List<Autokategorie> autokategorie;
    protected List<Auto> auto;
    protected List<Kunde> kunde;

    /**
     * Gets the value of the stadt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stadt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStadt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stadt }
     * 
     * 
     */
    public List<Stadt> getStadt() {
        if (stadt == null) {
            stadt = new ArrayList<Stadt>();
        }
        return this.stadt;
    }

    /**
     * Gets the value of the autokategorie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autokategorie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutokategorie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Autokategorie }
     * 
     * 
     */
    public List<Autokategorie> getAutokategorie() {
        if (autokategorie == null) {
            autokategorie = new ArrayList<Autokategorie>();
        }
        return this.autokategorie;
    }

    /**
     * Gets the value of the auto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Auto }
     * 
     * 
     */
    public List<Auto> getAuto() {
        if (auto == null) {
            auto = new ArrayList<Auto>();
        }
        return this.auto;
    }

    /**
     * Gets the value of the kunde property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kunde property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKunde().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kunde }
     * 
     * 
     */
    public List<Kunde> getKunde() {
        if (kunde == null) {
            kunde = new ArrayList<Kunde>();
        }
        return this.kunde;
    }

}
