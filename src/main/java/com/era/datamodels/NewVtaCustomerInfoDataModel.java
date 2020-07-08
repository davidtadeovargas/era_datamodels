/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.datamodels;

import com.era.models.Company;

/**
 *
 * @author PC
 */
public class NewVtaCustomerInfoDataModel {
    
    private Company Company;
    private boolean contado;
    private boolean email1;
    private boolean email2;
    private boolean email3;
    private boolean updateCustomer;

    public Company getCompany() {
        return Company;
    }

    public void setCompany(Company Company) {
        this.Company = Company;
    }

    public boolean isContado() {
        return contado;
    }

    public void setContado(boolean contado) {
        this.contado = contado;
    }

    public boolean isEmail1() {
        return email1;
    }

    public void setEmail1(boolean email1) {
        this.email1 = email1;
    }

    public boolean isEmail2() {
        return email2;
    }

    public void setEmail2(boolean email2) {
        this.email2 = email2;
    }

    public boolean isEmail3() {
        return email3;
    }

    public void setEmail3(boolean email3) {
        this.email3 = email3;
    }

    public boolean isUpdateCustomer() {
        return updateCustomer;
    }

    public void setUpdateCustomer(boolean updateCustomer) {
        this.updateCustomer = updateCustomer;
    }
    
    
    
}
