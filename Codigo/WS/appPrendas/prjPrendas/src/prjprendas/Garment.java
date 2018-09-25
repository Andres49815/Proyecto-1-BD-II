package prjprendas;

import java.io.Serializable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "Garment.findAll", query = "select o from Garment o") })
public class Garment implements Serializable {
    private static final long serialVersionUID = 1760336571763717421L;
    @Column(nullable = false, length = 120)
    private String description;
    @Id
    @Column(nullable = false)
    private BigDecimal id;
    @Column(nullable = false)
    private byte[] image;
    @Column(nullable = false)
    private BigDecimal style;
    @Column(name = "UNIT_COST", nullable = false)
    private double unitCost;
    @Column(nullable = false)
    private byte[] video;

    public Garment() {
    }

    public Garment(String description, BigDecimal id, BigDecimal style, double unitCost) {
        this.description = description;
        this.id = id;
        this.style = style;
        this.unitCost = unitCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public BigDecimal getStyle() {
        return style;
    }

    public void setStyle(BigDecimal style) {
        this.style = style;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
    }
}
