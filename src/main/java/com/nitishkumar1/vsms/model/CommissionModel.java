package com.nitishkumar1.vsms.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CommissionModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "version")
    private int version;

    @Column(name = "whl2cLT30k")
    private int whl2cLT30k;

    @Column(name = "whl2cBTW30kto50k")
    private int whl2cBTW30kto50k;

    @Column(name = "whl2cGT50k")
    private int whl2cGT50k;

    @Column(name = "whl3cLT50k")
    private int whl3cLT50k;

    @Column(name = "whl3cGT50k")
    private int whl3cGT50k;

    @Column(name = "whl4cLT1l")
    private int whl4cLT1l;

    @Column(name = "whl4cBTW1lto5l")
    private int whl4cBTW1lto5l;

    @Column(name = "whl4cGT5l")
    private int whl4cGT5l;

    @Column(name = "commercialcLT5l")
    private int commercialcLT5l;

    @Column(name = "getCommercialcGT5l")
    private int getCommercialcGT5l;

    @Column(name = "firstLevel")
    private double firstLevel;

    @Column(name = "secondLevel")
    private double secondLevel;

    @Column(name = "thirdLevel")
    private double thirdLevel;

    public CommissionModel() {
    }

    public CommissionModel(int version, int whl2cLT30k, int whl2cBTW30kto50k, int whl2cGT50k, int whl3cLT50k, int whl3cGT50k, int whl4cLT1l, int whl4cBTW1lto5l, int whl4cGT5l, int commercialcLT5l, int getCommercialcGT5l, double firstLevel, double secondLevel, double thirdLevel) {
        this.version = version;
        this.whl2cLT30k = whl2cLT30k;
        this.whl2cBTW30kto50k = whl2cBTW30kto50k;
        this.whl2cGT50k = whl2cGT50k;
        this.whl3cLT50k = whl3cLT50k;
        this.whl3cGT50k = whl3cGT50k;
        this.whl4cLT1l = whl4cLT1l;
        this.whl4cBTW1lto5l = whl4cBTW1lto5l;
        this.whl4cGT5l = whl4cGT5l;
        this.commercialcLT5l = commercialcLT5l;
        this.getCommercialcGT5l = getCommercialcGT5l;
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
        this.thirdLevel = thirdLevel;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getWhl2cLT30k() {
        return whl2cLT30k;
    }

    public void setWhl2cLT30k(int whl2cLT30k) {
        this.whl2cLT30k = whl2cLT30k;
    }

    public int getWhl2cBTW30kto50k() {
        return whl2cBTW30kto50k;
    }

    public void setWhl2cBTW30kto50k(int whl2cBTW30kto50k) {
        this.whl2cBTW30kto50k = whl2cBTW30kto50k;
    }

    public int getWhl2cGT50k() {
        return whl2cGT50k;
    }

    public void setWhl2cGT50k(int whl2cGT50k) {
        this.whl2cGT50k = whl2cGT50k;
    }

    public int getWhl3cLT50k() {
        return whl3cLT50k;
    }

    public void setWhl3cLT50k(int whl3cLT50k) {
        this.whl3cLT50k = whl3cLT50k;
    }

    public int getWhl3cGT50k() {
        return whl3cGT50k;
    }

    public void setWhl3cGT50k(int whl3cGT50k) {
        this.whl3cGT50k = whl3cGT50k;
    }

    public int getWhl4cLT1l() {
        return whl4cLT1l;
    }

    public void setWhl4cLT1l(int whl4cLT1l) {
        this.whl4cLT1l = whl4cLT1l;
    }

    public int getWhl4cBTW1lto5l() {
        return whl4cBTW1lto5l;
    }

    public void setWhl4cBTW1lto5l(int whl4cBTW1lto5l) {
        this.whl4cBTW1lto5l = whl4cBTW1lto5l;
    }

    public int getWhl4cGT5l() {
        return whl4cGT5l;
    }

    public void setWhl4cGT5l(int whl4cGT5l) {
        this.whl4cGT5l = whl4cGT5l;
    }

    public int getCommercialcLT5l() {
        return commercialcLT5l;
    }

    public void setCommercialcLT5l(int commercialcLT5l) {
        this.commercialcLT5l = commercialcLT5l;
    }

    public int getGetCommercialcGT5l() {
        return getCommercialcGT5l;
    }

    public void setGetCommercialcGT5l(int getCommercialcGT5l) {
        this.getCommercialcGT5l = getCommercialcGT5l;
    }

    public double getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(double firstLevel) {
        this.firstLevel = firstLevel;
    }

    public double getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(double secondLevel) {
        this.secondLevel = secondLevel;
    }

    public double getThirdLevel() {
        return thirdLevel;
    }

    public void setThirdLevel(double thirdLevel) {
        this.thirdLevel = thirdLevel;
    }
}
