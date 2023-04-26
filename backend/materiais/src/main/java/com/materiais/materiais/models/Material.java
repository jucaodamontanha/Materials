package com.materiais.materiais.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_MATERIAL")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int brInicial;

    private int brFinal;

    private int brTotal;

    private int ptInicial;

    private int ptFinal;

    private int ptTotal;

    private int numeroContrato;

    public int getBrInicial() {
        return brInicial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrInicial(int brInicial) {
        this.brInicial = brInicial;
    }

    public int getBrFinal() {
        return brFinal;
    }

    public void setBrFinal(int brFinal) {
        this.brFinal = brFinal;
    }

    public int getBrTotal() {
        return brTotal;
    }

    public void setBrTotal(int brTotal) {
        this.brTotal = brTotal;
    }

    public int getPtInicial() {
        return ptInicial;
    }

    public void setPtInicial(int ptInicial) {
        this.ptInicial = ptInicial;
    }

    public int getPtFinal() {
        return ptFinal;
    }

    public void setPtFinal(int ptFinal) {
        this.ptFinal = ptFinal;
    }

    public int getPtTotal() {
        return ptTotal;
    }

    public void setPtTotal(int ptTotal) {
        this.ptTotal = ptTotal;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }
}
