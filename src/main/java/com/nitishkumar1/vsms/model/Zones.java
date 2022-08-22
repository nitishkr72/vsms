package com.nitishkumar1.vsms.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zones")
public class Zones implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zone_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "target_monthly_quota")
    private long targetMonthlyQuota;

    @OneToMany(mappedBy = "zone",cascade = {CascadeType.PERSIST, CascadeType.DETACH,
                CascadeType.MERGE, CascadeType.REFRESH})
    @JsonManagedReference
    private List<Employee> employeeList = new ArrayList<>();


    @OneToMany(mappedBy = "zone",cascade = {CascadeType.PERSIST, CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.REFRESH})
    @JsonManagedReference
    private List<ProductSold> productSold = new ArrayList<>();

    public Zones() {
    }

    public Zones(int zoneId, String name, long targetMonthlyQuota, List<Employee> employeeList, List<ProductSold> productSold) {
        this.id = zoneId;
        this.name = name;
        this.targetMonthlyQuota = targetMonthlyQuota;
        this.employeeList = employeeList;
        this.productSold = productSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTargetMonthlyQuota() {
        return targetMonthlyQuota;
    }

    public void setTargetMonthlyQuota(long targetMonthlyQuota) {
        this.targetMonthlyQuota = targetMonthlyQuota;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProductSold> getProductSold() {
        return productSold;
    }

    public void setProductSold(List<ProductSold> productSold) {
        this.productSold = productSold;
    }

    @Override
    public String toString() {
        return "Zones{" +
                "zoneId=" + id +
                ", name='" + name + '\'' +
                ", targetMonthlyQuota=" + targetMonthlyQuota +
                ", employeeList=" + employeeList +
                ", productSold=" + productSold +
                '}';
    }
}
