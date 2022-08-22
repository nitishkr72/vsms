package com.nitishkumar1.vsms.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_sold")
public class ProductSold implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_sold_id")
    private int id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "sold_product_id")
    private Product product;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "salesperson_id")
    private Employee employee;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "sold_zone_id")
    private Zones zone;

    @Column(name = "sold_time")
    private LocalDateTime soldTime;

    public ProductSold() {
    }

    public ProductSold(int productSoldId, Product product, Employee employee, Zones zone, LocalDateTime soldTime) {
        this.id = productSoldId;
        this.product = product;
        this.employee = employee;
        this.zone = zone;
        this.soldTime = soldTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Zones getZone() {
        return zone;
    }

    public void setZone(Zones zone) {
        this.zone = zone;
    }

    public LocalDateTime getSoldTime() {
        return soldTime;
    }

    public void setSoldTime(LocalDateTime soldTime) {
        this.soldTime = soldTime;
    }

    @Override
    public String toString() {
        return "ProductSold{" +
                "productSoldId=" + id +
                ", product=" + product +
                ", employee=" + employee +
                ", zone=" + zone +
                ", soldTime=" + soldTime +
                '}';
    }
}
