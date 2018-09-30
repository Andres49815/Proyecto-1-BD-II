package prendapps;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlTransient;

@Entity
@NamedQueries({ @NamedQuery(name = "LineRequest.findAll", query = "select o from LineRequest o") })
@Table(name = "LINE_REQUEST")
@IdClass(LineRequestPK.class)
public class LineRequest implements Serializable {
    private static final long serialVersionUID = 8304090017112883703L;
    @Column(nullable = false)
    private BigDecimal garment;
    @Column(name = "GARMENT_SIZE", nullable = false)
    private BigDecimal garmentSize;
    @Id
    @Column(name = "LINE_ID", nullable = false)
    private BigDecimal lineId;
    @Column(nullable = false)
    private BigDecimal quantity;
    @Id
    @Column(name = "REQUEST_ID", nullable = false)
    private BigDecimal requestId;
    @Column(name = "UNIT_PRICE")
    private double unitPrice;
    @ManyToOne
    @JoinColumn(name = "REQUEST_ID", insertable = false, updatable = false)
    private Request lineRequest;

    public LineRequest() {
    }

    public LineRequest(BigDecimal garment, BigDecimal garmentSize, BigDecimal lineId, BigDecimal quantity,
                       BigDecimal requestId, double unitPrice) {
        this.garment = garment;
        this.garmentSize = garmentSize;
        this.lineId = lineId;
        this.quantity = quantity;
        this.requestId = requestId;
        this.unitPrice = unitPrice;
    }


    public BigDecimal getGarment() {
        return garment;
    }

    public void setGarment(BigDecimal garment) {
        this.garment = garment;
    }

    public BigDecimal getGarmentSize() {
        return garmentSize;
    }

    public void setGarmentSize(BigDecimal garmentSize) {
        this.garmentSize = garmentSize;
    }

    public BigDecimal getLineId() {
        return lineId;
    }

    public void setLineId(BigDecimal lineId) {
        this.lineId = lineId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRequestId() {
        return requestId;
    }

    public void setRequestId(BigDecimal requestId) {
        this.requestId = requestId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @XmlTransient
    public Request getLineRequest() {
        return lineRequest;
    }

    public void setLineRequest(Request lineRequest) {
        this.lineRequest = lineRequest;
        if (lineRequest != null) {
            this.requestId = lineRequest.getId();
        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("garment=");
        buffer.append(getGarment());
        buffer.append(',');
        buffer.append("garmentSize=");
        buffer.append(getGarmentSize());
        buffer.append(',');
        buffer.append("lineId=");
        buffer.append(getLineId());
        buffer.append(',');
        buffer.append("quantity=");
        buffer.append(getQuantity());
        buffer.append(',');
        buffer.append("unitPrice=");
        buffer.append(getUnitPrice());
        buffer.append(']');
        return buffer.toString();
    }
}
