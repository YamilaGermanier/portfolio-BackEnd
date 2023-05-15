package com.porfolio.ArgPro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Capacitaciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    private String fechaExpedicion;
    private String nombreCap;
    private String institucionCap;

    public Capacitaciones() {
    }

    public Capacitaciones(String fechaExpedicion, String nombreCap, String institucionCap) {
        this.fechaExpedicion = fechaExpedicion;
        this.nombreCap = nombreCap;
        this.institucionCap = institucionCap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getNombreCap() {
        return nombreCap;
    }

    public void setNombreCap(String nombreCap) {
        this.nombreCap = nombreCap;
    }

    public String getInstitucionCap() {
        return institucionCap;
    }

    public void setInstitucionCap(String institucionCap) {
        this.institucionCap = institucionCap;
    }
    
    
}
