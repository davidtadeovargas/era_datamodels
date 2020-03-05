/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.datamodels;

/**
 *
 * @author PC
 */
public class PremiumFuntionsDataModel {

    private boolean premium;
    private boolean sendToOnlyOneDestinataryInFact;
    private boolean onlyUseIVATax;
    private boolean onlyOneSerieForDocument;
    private boolean disableInvoiceTicketsWindow;

    
    
    
    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isSendToOnlyOneDestinataryInFact() {
        return sendToOnlyOneDestinataryInFact;
    }

    public void setSendToOnlyOneDestinataryInFact(boolean sendToOnlyOneDestinataryInFact) {
        this.sendToOnlyOneDestinataryInFact = sendToOnlyOneDestinataryInFact;
    }

    public boolean isOnlyUseIVATax() {
        return onlyUseIVATax;
    }

    public void setOnlyUseIVATax(boolean onlyUseIVATax) {
        this.onlyUseIVATax = onlyUseIVATax;
    }

    public boolean isOnlyOneSerieForDocument() {
        return onlyOneSerieForDocument;
    }

    public void setOnlyOneSerieForDocument(boolean onlyOneSerieForDocument) {
        this.onlyOneSerieForDocument = onlyOneSerieForDocument;
    }

    public boolean isDisableInvoiceTicketsWindow() {
        return disableInvoiceTicketsWindow;
    }

    public void setDisableInvoiceTicketsWindow(boolean disableInvoiceTicketsWindow) {
        this.disableInvoiceTicketsWindow = disableInvoiceTicketsWindow;
    }
}
