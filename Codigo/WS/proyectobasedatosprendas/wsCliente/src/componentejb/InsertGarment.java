
package componentejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertGarment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="insertGarment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://componentejb/}garment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertGarment", propOrder = { "arg0" })
public class InsertGarment {

    protected Garment arg0;

    /**
     * Gets the value of the arg0 property.
     *
     * @return
     *     possible object is
     *     {@link Garment }
     *
     */
    public Garment getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     *
     * @param value
     *     allowed object is
     *     {@link Garment }
     *
     */
    public void setArg0(Garment value) {
        this.arg0 = value;
    }

}
