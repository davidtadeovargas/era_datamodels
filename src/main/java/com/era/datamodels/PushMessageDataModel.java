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
public class PushMessageDataModel extends BaseDataModel{
    
    private String message;    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}