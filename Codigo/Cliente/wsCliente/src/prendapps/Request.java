
package prendapps;

import java.math.BigDecimal;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import model.ForTable;


/**
 * <p>Java class for request complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="deliverDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = { "client", "deliverDate", "id", "requestDate" })
public class Request implements ForTable{

    protected BigDecimal client;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliverDate;
    protected BigDecimal id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;

    /**
     * Gets the value of the client property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setClient(BigDecimal value) {
        this.client = value;
    }

    /**
     * Gets the value of the deliverDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDeliverDate() {
        return deliverDate;
    }

    /**
     * Sets the value of the deliverDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDeliverDate(XMLGregorianCalendar value) {
        this.deliverDate = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the requestDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    @Override public int getID() {
            return 0;
        }

        @Override public String getTitle() {
            return this.id + ": " ;
        }

        @Override public String[] getHeader() {
            String[] head = {"ID", "CLIENT", "REQUEST DATE", "DELIVER DATE", "MODIFY", "DELETE", "VIEW LINES"};
            return head;
        }

        @Override public Object[] getRow() {
            //Object[] row = {this.ID, this.CLIENT, this.REQUEST_DATE, this.DELIVER_DATE, 
             //   new JButton("MODIFY"), new JButton("DELETE"), new JButton("VIEW LINES")};
            return null;
        }

        @Override public ArrayList<ForTable> getNext() {
            return null;
        }
}
