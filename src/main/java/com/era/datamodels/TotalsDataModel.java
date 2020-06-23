/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.datamodels;

import java.math.BigDecimal;

/**
 *
 * @author PC
 */
public class TotalsDataModel {
    
    private BigDecimal taxes;
    private BigDecimal subtotal;
    private BigDecimal disccount;
    private BigDecimal total;
    private BigDecimal cant;

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }       

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getDisccount() {
        return disccount;
    }

    public void setDisccount(BigDecimal disccount) {
        this.disccount = disccount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getCant() {
        return cant;
    }

    public void setCant(BigDecimal cant) {
        this.cant = cant;
    }
}
