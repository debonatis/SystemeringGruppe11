/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.bestilling;
import com.corejsf.DBadm.DBController;
import com.corejsf.rett;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.ArrayList;  
import java.util.List;  
import javax.faces.application.FacesMessage;  
import javax.faces.context.FacesContext;  
import javax.swing.ImageIcon;
 
  
import org.primefaces.model.DualListModel;
import org.primefaces.event.

/**
 *
 * @author deb
 */
@Named
@SessionScoped
public class plukkListeBean extends DBController implements Serializable{
    
    
    
    private DualListModel<rett> players;  
      
    private DualListModel<String> cities;  
  
    public plukkListeBean() {  
        //Retter  
        List<rett> source = new ArrayList<rett>();  
        List<rett> target = new ArrayList<rett>();  
          
        source.add(new rett(1, "Klubb", "godMat",new ImageIcon(getClass().getResource("/rettBilder/godt.jpg"), "namnam")));  
        source.add(new rett(2, "Burger", "godMat",new ImageIcon(getClass().getResource("/rettBilder/polse.jpg"), "namnam")));  
        source.add(new rett(3, "tull", "godMat",new ImageIcon(getClass().getResource("/rettBilder/lastned.jpg"), "namnam")));  
        source.add(new rett(4, "Flesk", "godMat",new ImageIcon(getClass().getResource("/rettBilder/reker.jpg"), "namnam")));  
        source.add(new rett(5, "mmmm", "godMat",new ImageIcon(getClass().getResource("/rettBilder/reker.jpg"), "namnam")));  
        source.add(new rett(6, "hellvett", "godMat",new ImageIcon(getClass().getResource("/rettBilder/godt.jpg"), "namnam")));      
          
        players = new DualListModel<rett>(source, target);  
          
        //Cities  
        List<String> citiesSource = new ArrayList<String>();  
        List<String> citiesTarget = new ArrayList<String>();  
          
        citiesSource.add("Istanbul");  
        citiesSource.add("Ankara");  
        citiesSource.add("Izmir");  
        citiesSource.add("Antalya");  
        citiesSource.add("Bursa");  
          
        cities = new DualListModel<String>(citiesSource, citiesTarget);  
    }  
      
    public DualListModel<rett> getPlayers() {  
        return players;  
    }  
    public void setPlayers(DualListModel<rett> players) {  
        this.players = players;  
    }  
      
    public DualListModel<String> getCities() {  
        return cities;    
}  
    public void setCities(DualListModel<String> cities) {  
        this.cities = cities;  
    }  
      
    public void onTransfer(TransferEvent event) {  
        StringBuilder builder = new StringBuilder();  
        for(Object item : event.getItems()) {  
            builder.append(((rett) item).getNavn()).append("<br />");  
        }  
          
        FacesMessage msg = new FacesMessage();  
        msg.setSeverity(FacesMessage.SEVERITY_INFO);  
        msg.setSummary("Items Transferred");  
        msg.setDetail(builder.toString());  
          
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    } 
    
    
}
