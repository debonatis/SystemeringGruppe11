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

    private DualListModel<rett> retter;

    public plukkListeBean() {
        //Retter  
        List<rett> source = new ArrayList<rett>();
        List<rett> target = new ArrayList<rett>();

        source.add(new rett(1, "Klubb", "godMat", new ImageIcon(getClass().getResource("/rettBilder/godt.jpg"), "namnam")));
        source.add(new rett(2, "Burger", "godMat", new ImageIcon(getClass().getResource("/rettBilder/polse.jpg"), "namnam")));
        source.add(new rett(3, "tull", "godMat", new ImageIcon(getClass().getResource("/rettBilder/lastned.jpg"), "namnam")));
        source.add(new rett(4, "Flesk", "godMat", new ImageIcon(getClass().getResource("/rettBilder/reker.jpg"), "namnam")));
        source.add(new rett(5, "mmmm", "godMat", new ImageIcon(getClass().getResource("/rettBilder/reker.jpg"), "namnam")));
        source.add(new rett(6, "hellvett", "godMat", new ImageIcon(getClass().getResource("/rettBilder/godt.jpg"), "namnam")));

        retter = new DualListModel<rett>(source, target);


    }

    public DualListModel<rett> getRetter() {
        return retter;
    }

    public void setRetter(DualListModel<rett> retter) {
        this.retter = retter;
    }

    public void paaTransfer(TransferEvent event) {
        StringBuilder builder = new StringBuilder();
        for (Object item : event.getItems()) {
            builder.append(((rett) item).getNavn()).append("<br />");
        }

        FacesMessage msg = new FacesMessage();
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        msg.setSummary("Rettvalg Bekreftet");
        msg.setDetail(builder.toString());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
