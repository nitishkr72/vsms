package com.nitishkumar1.vsms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
@JsonIgnoreProperties("{hibernateLazyInitializer, handler}")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "manager_Id")
    private int managerId;

    @Column(name = "level")
    private int level;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH,
                                CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "zone_id")
    private Zones zone;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "password")
    private String password;

    @Column(name = "monthly_sales_quota")
    private long monthlySalesQuota;

    @OneToMany(mappedBy = "employee",cascade = {CascadeType.PERSIST, CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.REFRESH})
    private List<ProductSold> productSolds = new ArrayList<>();

    public Employee() {
    }

    public Employee(int employeeId,
                    String name, int managerId, int level, Zones zone,
                    String email, long phoneNumber, String imageUrl, String password,
                    long monthlySalesQuota, List<ProductSold> productSolds) {
        this.id = employeeId;
        this.name = name;
        this.managerId = managerId;
        this.level = level;
        this.zone = zone;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.password = password;
        this.monthlySalesQuota = monthlySalesQuota;
        this.productSolds = productSolds;
    }

    public long getMonthlySalesQuota() {
        return monthlySalesQuota;
    }

    public void setMonthlySalesQuota(long monthlySalesQuota) {
        this.monthlySalesQuota = monthlySalesQuota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<ProductSold> getProductSolds() {
        return productSolds;
    }

    public void setProductSolds(List<ProductSold> productSolds) {
        this.productSolds = productSolds;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Zones getZone() {
        return zone;
    }

    public void setZone(Zones zone) {
        this.zone = zone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", managerId=" + managerId +
                ", level=" + level +
                ", zone=" + zone +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", imageUrl='" + imageUrl + '\'' +
                ", password='" + password + '\'' +
                ", monthlySalesQuota=" + monthlySalesQuota +
                ", productSolds=" + productSolds +
                '}';
    }
}
