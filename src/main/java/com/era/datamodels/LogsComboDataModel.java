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
public class LogsComboDataModel {
    
    private String description;
    private boolean registrosCreados;
    private boolean registrosActualizados;
    private boolean registrosEliminados;
    private boolean loginUsuarios;
    private boolean cierreSesionUsuarios;
    private boolean inicioSesionUsuarios;
    private boolean empty;

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRegistrosCreados() {
        return registrosCreados;
    }

    public void setRegistrosCreados(boolean registrosCreados) {
        this.registrosCreados = registrosCreados;
    }

    public boolean isRegistrosActualizados() {
        return registrosActualizados;
    }

    public void setRegistrosActualizados(boolean registrosActualizados) {
        this.registrosActualizados = registrosActualizados;
    }

    public boolean isRegistrosEliminados() {
        return registrosEliminados;
    }

    public void setRegistrosEliminados(boolean registrosEliminados) {
        this.registrosEliminados = registrosEliminados;
    }

    public boolean isLoginUsuarios() {
        return loginUsuarios;
    }

    public void setLoginUsuarios(boolean loginUsuarios) {
        this.loginUsuarios = loginUsuarios;
    }

    public boolean isCierreSesionUsuarios() {
        return cierreSesionUsuarios;
    }

    public void setCierreSesionUsuarios(boolean cierreSesionUsuarios) {
        this.cierreSesionUsuarios = cierreSesionUsuarios;
    }

    public boolean isInicioSesionUsuarios() {
        return inicioSesionUsuarios;
    }

    public void setInicioSesionUsuarios(boolean inicioSesionUsuarios) {
        this.inicioSesionUsuarios = inicioSesionUsuarios;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
