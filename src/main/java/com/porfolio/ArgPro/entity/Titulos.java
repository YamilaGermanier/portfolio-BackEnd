package com.porfolio.ArgPro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Titulos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String logoInst;
    private String nombreTitulo;
    private String institucion;
    @Temporal(TemporalType.DATE)
    private String fechaEgreso;

    public Titulos() {
    }

    public Titulos(String logoInst, String nombreTitulo, String institucion, String fechaEgreso) {
        this.logoInst = logoInst;
        this.nombreTitulo = nombreTitulo;
        this.institucion = institucion;
        this.fechaEgreso = fechaEgreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogoInst() {
        return logoInst;
    }

    public void setLogoInst(String logoInst) {
        this.logoInst = logoInst;
    }

    public String getNombreTitulo() {
        return nombreTitulo;
    }

    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }
    
    
}
