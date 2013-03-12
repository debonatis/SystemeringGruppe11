/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.brukerAdm;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author deb
 */
@Named
@SessionScoped
public class brukerregistreringBean extends BrukerBehandling{
    
    private Bruker user = new Bruker();  

    @Override
    public String getName() {
        return super.getName();
    }
      
    private boolean skip;  
      
    private static final Logger logger = Logger.getLogger(brukerregistreringBean.class.getName());  
  
    public Bruker getUser() {  
        return user;  
    }  
  
    public void setUser(Bruker user) {  
        this.user = user;  
    }  
      
    public void save(ActionEvent actionEvent) { 
       
          
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + user.fornavn);  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
      
    public boolean isSkip() {  
        return skip;  
    }  
  
    public void setSkip(boolean skip) {  
        this.skip = skip;  
    }  
      
    public String onFlowProcess(FlowEvent event) {  
        logger.log(Level.INFO, "Current wizard step:{0}", event.getOldStep());  
        logger.log(Level.INFO, "Next step:{0}", event.getNewStep());  
          
        if(skip) {  
            skip = false;   //reset in case user goes back  
            return "confirm";  
        }  
        else {  
            return event.getNewStep();  
        }  
    }  
}  
    
