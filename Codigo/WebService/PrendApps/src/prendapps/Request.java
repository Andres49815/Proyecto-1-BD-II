package prendapps;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlTransient;

@Entity
@NamedQueries({ @NamedQuery(name = "Request.findAll", query = "select o from Request o") })
public class Request implements Serializable {
    private static final long serialVersionUID = -3238292324196882339L;
    @Column(nullable = false)
    private BigDecimal client;
    @Temporal(TemporalType.DATE)
    @Column(name = "DELIVER_DATE", nullable = false)
    private Date deliverDate;
    @Id
    @Column(nullable = false)
    private BigDecimal id;
    @Temporal(TemporalType.DATE)
    @Column(name = "REQUEST_DATE", nullable = false)
    private Date requestDate;
    @OneToMany(mappedBy = "lineRequest", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<LineRequest> lineRequestList;

    public Request() {
    }

    public Request(BigDecimal client, Date deliverDate, BigDecimal id, Date requestDate) {
        this.client = client;
        this.deliverDate = deliverDate;
        this.id = id;
        this.requestDate = requestDate;
    }


    public BigDecimal getClient() {
        return client;
    }

    public void setClient(BigDecimal client) {
        this.client = client;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    @XmlTransient
    public List<LineRequest> getLineRequestList() {
        return lineRequestList;
    }

    public void setLineRequestList(List<LineRequest> lineRequestList) {
        this.lineRequestList = lineRequestList;
    }

    public LineRequest addLineRequest(LineRequest lineRequest) {
        getLineRequestList().add(lineRequest);
        lineRequest.setLineRequest(this);
        return lineRequest;
    }

    public LineRequest removeLineRequest(LineRequest lineRequest) {
        getLineRequestList().remove(lineRequest);
        lineRequest.setLineRequest(null);
        return lineRequest;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("client=");
        buffer.append(getClient());
        buffer.append(',');
        buffer.append("deliverDate=");
        buffer.append(getDeliverDate());
        buffer.append(',');
        buffer.append("id=");
        buffer.append(getId());
        buffer.append(',');
        buffer.append("requestDate=");
        buffer.append(getRequestDate());
        buffer.append(']');
        return buffer.toString();
    }
}
