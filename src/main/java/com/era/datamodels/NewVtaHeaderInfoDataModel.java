/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.datamodels;

import com.era.models.CPaymentForm;
import com.era.models.CPaymentMethod;
import com.era.models.CUsoCFDI;
import com.era.models.Coin;
import com.era.models.Serie;
import com.era.models.User;

/**
 *
 * @author PC
 */
public class NewVtaHeaderInfoDataModel {
    
    private Serie Serie;
    private CPaymentForm CPaymentForm;
    private CUsoCFDI CUsoCFDI;
    private Coin Coin;
    private CPaymentMethod MetogoPago;
    private String account;
    private boolean ring;
    private boolean sendEmail;
    private boolean showFile;
    private boolean cartaPorte;
    private boolean print;
    private String obervations;
    private User Salesman;
    private boolean paid;
    private String date;
    private String expeditionPlace;

    public Serie getSerie() {
        return Serie;
    }

    public void setSerie(Serie Serie) {
        this.Serie = Serie;
    }

    public CPaymentForm getCPaymentForm() {
        return CPaymentForm;
    }

    public void setCPaymentForm(CPaymentForm CPaymentForm) {
        this.CPaymentForm = CPaymentForm;
    }

    public CUsoCFDI getCUsoCFDI() {
        return CUsoCFDI;
    }

    public void setCUsoCFDI(CUsoCFDI CUsoCFDI) {
        this.CUsoCFDI = CUsoCFDI;
    }

    public Coin getCoin() {
        return Coin;
    }

    public void setCoin(Coin Coin) {
        this.Coin = Coin;
    }

    public CPaymentMethod getMetogoPago() {
        return MetogoPago;
    }

    public void setMetogoPago(CPaymentMethod CPaymentMethod) {
        this.MetogoPago = CPaymentMethod;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public boolean isRing() {
        return ring;
    }

    public void setRing(boolean ring) {
        this.ring = ring;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public boolean isShowFile() {
        return showFile;
    }

    public void setShowFile(boolean showFile) {
        this.showFile = showFile;
    }

    public boolean isCartaPorte() {
        return cartaPorte;
    }

    public void setCartaPorte(boolean cartaPorte) {
        this.cartaPorte = cartaPorte;
    }

    public boolean isPrint() {
        return print;
    }

    public void setPrint(boolean print) {
        this.print = print;
    }

    public String getObervations() {
        return obervations;
    }

    public void setObervations(String obervations) {
        this.obervations = obervations;
    }

    public User getSalesman() {
        return Salesman;
    }

    public void setSalesman(User Salesman) {
        this.Salesman = Salesman;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpeditionPlace() {
        return expeditionPlace;
    }

    public void setExpeditionPlace(String expeditionPlace) {
        this.expeditionPlace = expeditionPlace;
    }
}
