package prjprendas;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "Country.findAll", query = "select o from Country o") })
public class Country implements Serializable {
    @Id
    @Column(nullable = false)
    private BigDecimal id;
    @Column(nullable = false, length = 20)
    private String name;
    @OneToMany(mappedBy = "country", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Client> clientList;

    public Country() {
    }

    public Country(BigDecimal id, String name) {
        this.id = id;
        this.name = name;
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

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public Client addClient(Client client) {
        getClientList().add(client);
        client.setCountry(this);
        return client;
    }

    public Client removeClient(Client client) {
        getClientList().remove(client);
        client.setCountry(null);
        return client;
    }
}
