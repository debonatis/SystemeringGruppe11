/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.bestilling;

import com.corejsf.bestilling.rett;
import java.util.ArrayList;

/**
 *
 * @author deb
 */
public abstract class Meny {

    private ArrayList<rett> retter;
    private int number;
    private String beskrivelse;

    public void setRetter(ArrayList<rett> retter) {
        this.retter = retter;
    }
    
    public void addRett(rett rett){
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
    

    public ArrayList<rett> getRetter() {
        return retter;
    }
}
