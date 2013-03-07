/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import javax.persistence.Id;
import javax.swing.ImageIcon;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

/**
 *
 * @author deb
 */
public class rett extends Meny{
    
    private @Id
    int rettNr;    
    private @NotNull(message= "Du må skrive noe:)")   
    @Range(min = 1, max = 300, message= "The duration must be a number between 1 and 300!")
    double pris = 0;
    private @NotNull
    @Id
    String navn;
    private @NotNull
    @Length(min = 0, max = 30, message="The textfield can be empty, or contain maximum 30 characters")
    String beskrivelese;
    private ImageIcon bilde;

    public rett(int rettNr, String navn, String beskrivelese, ImageIcon bilde) {
        this.rettNr = rettNr;
        this.navn = navn;
        this.beskrivelese = beskrivelese;
        this.bilde = bilde;        
    }

    public double getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    public String getBeskrivelese() {
        return beskrivelese;
    }

    public ImageIcon getBilde() {
        return bilde;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setBeskrivelese(String beskrivelese) {
        this.beskrivelese = beskrivelese;
    }

    public void setBilde(ImageIcon bilde) {
        this.bilde = bilde;
    }
    
    
}
