/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.bestilling;

import com.corejsf.bestilling.Rett;
import java.util.ArrayList;

/**
 *
 * @author deb
 */
public class Meny {

    private ArrayList<Rett> retter;
    private int number;
    private String beskrivelse;

    public void setRetter(ArrayList<Rett> retter) {
        this.retter = retter;
    }
    
    public void addRett(Rett rett){
        retter.add(rett);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public int getNumber() {
        return number;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }
    

    public ArrayList<Rett> getRetter() {
        return retter;
    }
}
