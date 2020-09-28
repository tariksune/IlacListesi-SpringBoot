package com.tarxsoft.ilaclistesi.entity;

import javax.persistence.*;

@Entity
@Table(name = "drugs")
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "drugName")
    private String drugName;

    @Column(name = "drugActiveSubstance")
    private String drugActiveSubstance;

    @Column(name = "drugBarcode")
    private String drugBarcode;

    @Column(name = "drugCompany")
    private String drugCompany;

    @Column(name = "drugImage")
    private String drugImage;

    public Drug(Long id, String drugName, String drugActiveSubstance, String drugBarcode, String drugCompany, String drugImage) {
        this.id = id;
        this.drugName = drugName;
        this.drugActiveSubstance = drugActiveSubstance;
        this.drugBarcode = drugBarcode;
        this.drugCompany = drugCompany;
        this.drugImage = drugImage;
    }

    public Drug(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugActiveSubstance() {
        return drugActiveSubstance;
    }

    public void setDrugActiveSubstance(String drugActiveSubstance) {
        this.drugActiveSubstance = drugActiveSubstance;
    }

    public String getDrugBarcode() {
        return drugBarcode;
    }

    public void setDrugBarcode(String drugBarcode) {
        this.drugBarcode = drugBarcode;
    }

    public String getDrugCompany() {
        return drugCompany;
    }

    public void setDrugCompany(String drugCompany) {
        this.drugCompany = drugCompany;
    }

    public String getDrugImage() {
        return drugImage;
    }

    public void setDrugImage(String drugImage) {
        this.drugImage = drugImage;
    }
}
