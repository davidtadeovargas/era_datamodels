/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.datamodels;

/**
 *
 * @author PC POJO = Plain old java object
 */
public class CertificatesDataModel {
    
    private String certificatePath;
    private String certificateKeyPath;

    public String getCertificatePath() {
        return certificatePath;
    }

    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }

    public String getCertificateKeyPath() {
        return certificateKeyPath;
    }

    public void setCertificateKeyPath(String certificateKeyPath) {
        this.certificateKeyPath = certificateKeyPath;
    }
    
    
}
