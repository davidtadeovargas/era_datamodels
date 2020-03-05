/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.datamodels;

import com.era.models.BasDats;
import com.era.models.Company;
import com.era.models.Product;
import com.era.models.Supplier;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author PC
 */
public class TestCompanyDataModel {
    
    @JsonProperty("CompanyTestDataModel")
    private BasDats CompanyTestDataModel;
    
    @JsonProperty("PremiumFuntionsDataModel")
    private PremiumFuntionsDataModel PremiumFuntionsDataModel;
    
    @JsonProperty("Product1")
    private Product Product1; 
    
    @JsonProperty("Product2")
    private Product Product2; 
    
    @JsonProperty("Product3")
    private Product Product3; 
    
    @JsonProperty("Product4")
    private Product Product4;
    
    @JsonProperty("Product5")
    private Product Product5;
    
    @JsonProperty("Customer1")
    private Company Customer1;
    
    @JsonProperty("Customer2")
    private Company Customer2;
    
    @JsonProperty("Customer3")
    private Company Customer3;
    
    @JsonProperty("Customer4")
    private Company Customer4;
    
    @JsonProperty("Customer5")
    private Company Customer5;
    
    @JsonProperty("Supplier1")
    private Supplier Supplier1;
    
    @JsonProperty("Supplier2")
    private Supplier Supplier2;
    
    @JsonProperty("Supplier3")
    private Supplier Supplier3;
    
    @JsonProperty("Supplier4")
    private Supplier Supplier4;
    
    @JsonProperty("Supplier5")
    private Supplier Supplier5;
    
    

    
    
    
    public BasDats getCompanyTestDataModel() {
        return CompanyTestDataModel;
    }

    public void setCompanyTestDataModel(BasDats CompanyTestDataModel) {
        this.CompanyTestDataModel = CompanyTestDataModel;
    }

    public PremiumFuntionsDataModel getPremiumFuntionsDataModel() {
        return PremiumFuntionsDataModel;
    }

    public void setPremiumFuntionsDataModel(PremiumFuntionsDataModel PremiumFuntionsDataModel) {
        this.PremiumFuntionsDataModel = PremiumFuntionsDataModel;
    }

    public Product getProduct1() {
        return Product1;
    }

    public void setProduct1(Product Product1) {
        this.Product1 = Product1;
    }

    public Product getProduct2() {
        return Product2;
    }

    public void setProduct2(Product Product2) {
        this.Product2 = Product2;
    }

    public Product getProduct3() {
        return Product3;
    }

    public void setProduct3(Product Product3) {
        this.Product3 = Product3;
    }

    public Product getProduct4() {
        return Product4;
    }

    public void setProduct4(Product Product4) {
        this.Product4 = Product4;
    }

    public Product getProduct5() {
        return Product5;
    }

    public void setProduct5(Product Product5) {
        this.Product5 = Product5;
    }

    public Company getCustomer1() {
        return Customer1;
    }

    public void setCustomer1(Company Customer1) {
        this.Customer1 = Customer1;
    }

    public Company getCustomer2() {
        return Customer2;
    }

    public void setCustomer2(Company Customer2) {
        this.Customer2 = Customer2;
    }

    public Company getCustomer3() {
        return Customer3;
    }

    public void setCustomer3(Company Customer3) {
        this.Customer3 = Customer3;
    }

    public Company getCustomer4() {
        return Customer4;
    }

    public void setCustomer4(Company Customer4) {
        this.Customer4 = Customer4;
    }

    public Company getCustomer5() {
        return Customer5;
    }

    public void setCustomer5(Company Customer5) {
        this.Customer5 = Customer5;
    }

    public Supplier getSupplier1() {
        return Supplier1;
    }

    public void setSupplier1(Supplier Supplier1) {
        this.Supplier1 = Supplier1;
    }

    public Supplier getSupplier2() {
        return Supplier2;
    }

    public void setSupplier2(Supplier Supplier2) {
        this.Supplier2 = Supplier2;
    }

    public Supplier getSupplier3() {
        return Supplier3;
    }

    public void setSupplier3(Supplier Supplier3) {
        this.Supplier3 = Supplier3;
    }

    public Supplier getSupplier4() {
        return Supplier4;
    }

    public void setSupplier4(Supplier Supplier4) {
        this.Supplier4 = Supplier4;
    }

    public Supplier getSupplier5() {
        return Supplier5;
    }

    public void setSupplier5(Supplier Supplier5) {
        this.Supplier5 = Supplier5;
    }
}
