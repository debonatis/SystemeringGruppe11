/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.bestilling;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @beskrivelse deb
 */
@Entity
public class Rett implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rettNr;
    @Basic
    private String navn;
    @Basic
    private String beskrivelse;
    @Basic
    private Integer vekt;
    @Basic
    private String pris;
    @Basic
    private Double kalorier;
    @Basic
    private String ingred;

    public Rett() {
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getIngred() {
        return ingred;
    }

    public void setIngred(String ingred) {
        this.ingred = ingred;
    }

    public long getRettNr() {
        return rettNr;
    }

    public void setRettNR(long rettNr) {
        this.rettNr = rettNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Integer getVekt() {
        return vekt;
    }

    public void setVekt(Integer vekt) {
        this.vekt = vekt;
    }

    public String getPris() {
        return pris;
    }

    public void setPris(String pris) {
        this.pris = pris;
    }

    public Double getKalorier() {
        return kalorier;
    }

    public void setKalorier(Double kalorier) {
        this.kalorier = kalorier;
    }
}