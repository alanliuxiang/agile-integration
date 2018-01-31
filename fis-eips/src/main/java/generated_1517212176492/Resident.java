
package generated_1517212176492;

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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="utility" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicles" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="household" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
    "name",
    "phone",
    "utility",
    "vehicles",
    "household"
})
@XmlRootElement(name = "resident")
public class Resident {

    @XmlElement(required = true)
    protected String name;
    protected int phone;
    @XmlElement(required = true)
    protected String utility;
    protected byte vehicles;
    protected byte household;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     */
    public void setPhone(int value) {
        this.phone = value;
    }

    /**
     * Gets the value of the utility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtility() {
        return utility;
    }

    /**
     * Sets the value of the utility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtility(String value) {
        this.utility = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     */
    public byte getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     */
    public void setVehicles(byte value) {
        this.vehicles = value;
    }

    /**
     * Gets the value of the household property.
     * 
     */
    public byte getHousehold() {
        return household;
    }

    /**
     * Sets the value of the household property.
     * 
     */
    public void setHousehold(byte value) {
        this.household = value;
    }

}
