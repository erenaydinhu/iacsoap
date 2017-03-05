
package cxf.schemas.nl.eren.updatestationrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="naam">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="stad">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="capaciteit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="treinStation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="busStation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "naam",
    "stad",
    "capaciteit",
    "treinStation",
    "busStation"
})
@XmlRootElement(name = "updateStationRequest")
public class UpdateStationRequest {

    @XmlElement(required = true)
    protected String naam;
    @XmlElement(required = true)
    protected String stad;
    protected int capaciteit;
    protected boolean treinStation;
    protected boolean busStation;

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the stad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStad() {
        return stad;
    }

    /**
     * Sets the value of the stad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStad(String value) {
        this.stad = value;
    }

    /**
     * Gets the value of the capaciteit property.
     * 
     */
    public int getCapaciteit() {
        return capaciteit;
    }

    /**
     * Sets the value of the capaciteit property.
     * 
     */
    public void setCapaciteit(int value) {
        this.capaciteit = value;
    }

    /**
     * Gets the value of the treinStation property.
     * 
     */
    public boolean isTreinStation() {
        return treinStation;
    }

    /**
     * Sets the value of the treinStation property.
     * 
     */
    public void setTreinStation(boolean value) {
        this.treinStation = value;
    }

    /**
     * Gets the value of the busStation property.
     * 
     */
    public boolean isBusStation() {
        return busStation;
    }

    /**
     * Sets the value of the busStation property.
     * 
     */
    public void setBusStation(boolean value) {
        this.busStation = value;
    }

}
