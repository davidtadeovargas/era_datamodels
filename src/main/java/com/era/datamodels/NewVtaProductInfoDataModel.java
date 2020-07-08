/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.datamodels;

import com.era.models.Product;
import com.era.models.Unid;
import com.era.models.Warehouse;
import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class NewVtaProductInfoDataModel {
    
    private Product Product;
    private Warehouse Warehouse;
    private Unid Unid;
    private String partObservations;
    private BigDecimal cant;
    private int list;
    private BigDecimal price;
    private int disccount;

    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product Product) {
        this.Product = Product;
    }

    public Warehouse getWarehouse() {
        return Warehouse;
    }

    public void setWarehouse(Warehouse Warehouse) {
        this.Warehouse = Warehouse;
    }

    public Unid getUnid() {
        return Unid;
    }

    public void setUnid(Unid Unid) {
        this.Unid = Unid;
    }

    public String getPartObservations() {
        return partObservations;
    }

    public void setPartObservations(String partObservations) {
        this.partObservations = partObservations;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }

    public int getList() {
        return list;
    }

    public void setList(int list) {
        this.list = list;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getDisccount() {
        return disccount;
    }

    public void setDisccount(int disccount) {
        this.disccount = disccount;
    }        
}
