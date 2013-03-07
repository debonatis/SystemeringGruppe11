/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.brukerAdm;

import com.corejsf.annotations.UsrPswWaplj;
import javax.faces.bean.RequestScoped;
import javax.persistence.Id;

/**
 *
 * @author deb
 */
@RequestScoped
public class Bruker {

    private @Id
    @UsrPswWaplj(passordsjekk = 0, message = "This username is already in use,"
    + " or it is one that is too similar.\n "
    + "Write a new one! "
    + "The username must have a lenght between 6 and 10 characters!", sjekkDB = 1)
    String brukernavn;
    private String rolle;
    private @UsrPswWaplj(passordsjekk = 1, message = "The password must contain at least one uppercase "
    + "and one lowercase letter and one number. \n  The password must also contain one of following special characters(@#$%&). "
    + "Password must be between 6-10 characters!")
    String passord;
    String fornavn;
    String etternavn;
    int postNr;
    String gateAdresse;
    String postSted;
    String email;
    int telefon;
    private boolean endret;

    public synchronized boolean isEndret() {
        return endret;
    }

    public synchronized void setEndret(boolean endret) {
        this.endret = endret;
    }

    public Bruker() {
        this.brukernavn = "";
        this.rolle = "";
        this.passord = "";
        this.fornavn = "";
        this.etternavn = "";
        this.postNr = 0;
        this.gateAdresse = "";
        this.postSted = "";
        this.email = "";
        this.telefon = 0;
    }

    public Bruker(String brukernavn, String passord, String fornavn, String etternavn, int postNr,
            String adresse,String postSted,String email, int telefon, String rolle, int i) {
        this.brukernavn = brukernavn;
        this.passord = passord;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.postNr = postNr;
        this.gateAdresse = adresse;
        this.postSted = postSted;
        this.email = email;
        this.telefon = telefon;
        this.rolle = rolle;
        endret = false;
    }

    public Bruker(String brukernavn, String passord, String rolle) {
        this.brukernavn = brukernavn;
        this.rolle = rolle;
        this.passord = passord;
        endret = false;
    }

    /**
     * Get the value of rolle
     *
     * @return the value of rolle
     */
    public synchronized String getRolle() {
        return rolle;
    }

    /**
     * Set the value of rolle
     *
     * @param rolle new value of rolle
     */
    public synchronized void setRolle(String rolle) {
        if (!(this.rolle.equalsIgnoreCase(rolle))) {
            this.rolle = rolle;
            setEndret(true);
        }
    }

    /**
     * Get the value of passord
     *
     * @return the value of passord
     */
    public synchronized String getPassord() {
        return passord;
    }

    /**
     * Set the value of passord
     *
     * @param passord new value of passord
     */
    public synchronized void setPassord(String passord) {
        if (!(this.passord.equalsIgnoreCase(passord))) {
            this.passord = passord;
            setEndret(true);
        }
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public synchronized String getBrukernavn() {
        return brukernavn;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public synchronized void setBrukernavn(String brukernavn) {
        if (!(this.brukernavn.equalsIgnoreCase(brukernavn))) {
            this.brukernavn = brukernavn;
            setEndret(true);
        }
    }
    
        public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        if (!(this.fornavn.equalsIgnoreCase(fornavn))) {
            this.fornavn = fornavn;
            setEndret(true);
        }
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        if (!(this.etternavn.equalsIgnoreCase(etternavn))) {
            this.etternavn = etternavn;
            setEndret(true);
        }
    }

    public int getPostNr() {
        return postNr;
    }

    public void setPostNr(int postNr) {
        if (!(this.postNr == postNr)) {
            this.postNr = postNr;
            setEndret(true);
        }
    }

    public String getGateAdresse() {
        return gateAdresse;
    }

    public void setGateAdresse(String gateAdresse) {
        if (!(this.gateAdresse.equalsIgnoreCase(gateAdresse))) {
            this.gateAdresse = gateAdresse;
            setEndret(true);
        }
    }

    public String getPostSted() {
        return postSted;
    }

    public void setPostSted(String postSted) {
        if (!(this.postSted.equalsIgnoreCase(postSted))) {
            this.postSted = postSted;
            setEndret(true);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!(this.email.equalsIgnoreCase(email))) {
            this.email = email;
            setEndret(true);
        }
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        if (!(this.telefon == telefon)) {
            this.telefon = telefon;
            setEndret(true);
        }
    }
}
