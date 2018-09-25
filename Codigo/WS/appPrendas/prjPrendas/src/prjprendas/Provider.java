package prjprendas;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Provider.findAll", query = "select o from Provider o") })
public class Provider implements Serializable {
    private static final long serialVersionUID = 5414544980865874806L;
    @Column(name = "CONTACT_NAME", nullable = false, length = 30)
    private String contactName;
    @Column(nullable = false, length = 30)
    private String direction;
    @Column(nullable = false, length = 20)
    private String email;
    @Id
    @Column(nullable = false)
    private BigDecimal id;
    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false)
    private Integer phone;
    @Column(nullable = false)
    private String type;

    public Provider() {
    }

    public Provider(String contactName, String direction, String email, BigDecimal id, String name, Integer phone,
                    String type) {
        this.contactName = contactName;
        this.direction = direction;
        this.email = email;
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.type = type;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
