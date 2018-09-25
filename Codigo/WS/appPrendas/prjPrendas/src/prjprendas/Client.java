package prjprendas;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Client.findAll", query = "select o from Client o") })
public class Client implements Serializable {
    @Column(nullable = false, length = 30)
    private String direction;
    @Column(nullable = false, length = 20)
    private String email;
    @Id
    @Column(nullable = false)
    private BigDecimal id;
    @Column(name = "ID_NUMBER", nullable = false)
    private Integer idNumber;
    @Column(nullable = false, length = 20)
    private String lastname;
    @Column(nullable = false, length = 20)
    private String name;
    @Column(name = "PAYMENT_DIRECTION", nullable = false, length = 40)
    private String paymentDirection;
    @Column(nullable = false)
    private Integer phone;

    public Client() {
    }

    public Client(Country country, String direction, String email, BigDecimal id, Integer idNumber, String lastname,
                  String name, String paymentDirection, Integer phone) {
        this.country = country;
        this.direction = direction;
        this.email = email;
        this.id = id;
        this.idNumber = idNumber;
        this.lastname = lastname;
        this.name = name;
        this.paymentDirection = paymentDirection;
        this.phone = phone;
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

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentDirection() {
        return paymentDirection;
    }

    public void setPaymentDirection(String paymentDirection) {
        this.paymentDirection = paymentDirection;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
