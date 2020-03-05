/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.datamodels;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author PC
 */
public class ComputerLicenseDataModel extends BaseDataModel {
    
    private int id;
    private int userID;
    
    @JsonProperty("serie")
    private String serie;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("computerIDD")
    private String computerIDD;
    
    @JsonProperty("email")
    private String email;
    
    @JsonProperty("created_at")
    private String created_at;
    
    @JsonProperty("channel")
    private String channel;
    
    @JsonProperty("remainingDays")
    private int remainingDays;
    
    @JsonProperty("genericSerial")
    private String genericSerial;
        
    private boolean asign;
    
    @JsonProperty("numberComputers")
    private int numberComputers;
    
    @JsonProperty("TestCompanyDataModel")
    private TestCompanyDataModel TestCompanyDataModel;
    
    @JsonProperty("PremiumFuntionsDataModel")
    private PremiumFuntionsDataModel PremiumFuntionsDataModel;    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComputerIDD() {
        return computerIDD;
    }

    public void setComputerIDD(String computerIDD) {
        this.computerIDD = computerIDD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getRemainingDays() {
        return remainingDays;
    }

    public void setRemainingDays(int remainingDays) {
        this.remainingDays = remainingDays;
    }

    public String getGenericSerial() {
        return genericSerial;
    }

    public void setGenericSerial(String genericSerial) {
        this.genericSerial = genericSerial;
    }

    public boolean isAsign() {
        return asign;
    }

    public void setAsign(boolean asign) {
        this.asign = asign;
    }

    public int getNumberComputers() {
        return numberComputers;
    }

    public void setNumberComputers(int numberComputers) {
        this.numberComputers = numberComputers;
    }

    public TestCompanyDataModel getTestCompanyDataModel() {
        return TestCompanyDataModel;
    }

    public void setTestCompanyDataModel(TestCompanyDataModel TestCompanyDataModel) {
        this.TestCompanyDataModel = TestCompanyDataModel;
    }

    public PremiumFuntionsDataModel getPremiumFuntionsDataModel() {
        return PremiumFuntionsDataModel;
    }

    public void setPremiumFuntionsDataModel(PremiumFuntionsDataModel PremiumFuntionsDataModel) {
        this.PremiumFuntionsDataModel = PremiumFuntionsDataModel;
    }
}
