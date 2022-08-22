package com.nitishkumar1.vsms.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;


    @ManyToOne
    @JoinColumn(name = "product_type_id")
    @JsonBackReference
    private ProductType productType;

    @Column(name = "color")
    private String color;

    @Column(name = "cost")
    private long cost;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imgUrl;

    @OneToMany(mappedBy = "product",cascade = {CascadeType.PERSIST, CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.REFRESH})
    @JsonManagedReference
    private List<ProductSold> productSoldList;

    public Product() {
    }

    public Product(int productId, ProductType productType, String color, long cost, String description, String imgUrl, List<ProductSold> productSoldList) {
        this.id = productId;
        this.productType = productType;
        this.color = color;
        this.cost = cost;
        this.description = description;
        this.imgUrl = imgUrl;
        this.productSoldList = productSoldList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<ProductSold> getProductSoldList() {
        return productSoldList;
    }

    public void setProductSoldList(List<ProductSold> productSoldList) {
        this.productSoldList = productSoldList;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + id +
                ", productType=" + productType +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
