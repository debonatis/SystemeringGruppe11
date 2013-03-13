/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.bestilling;

import com.corejsf.DBadm.DBController;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.swing.ImageIcon;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

/**
 *
 * @author deb
 */
@Named
@SessionScoped
public class plukkListeBean extends DBController implements Serializable {

    private List<Rett> retter;
    
    private Rett valgt;

    public List<Rett> getRetter() {
        return retter;
    }

    public void setRetter(List<Rett> retter) {
        this.retter = retter;
    }

    public void setValgt(Rett valgt) {
        this.valgt = valgt;
    }

    public Rett getValgt() {
        return valgt;
    }

    
}
