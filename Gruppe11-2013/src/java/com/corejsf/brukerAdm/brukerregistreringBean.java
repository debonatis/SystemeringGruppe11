/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf.brukerAdm;

import java.awt.event.ActionEvent;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author deb
 */
public class brukerregistreringBean {
    
    private Bruker user = new Bruker();  
      
    private boolean skip;  
      
    private static Logger logger = Logger.getLogger(brukerregistreringBean.class.getName());  
  
    public Bruker getUser() {  
        return user;  
    }  
  
    public void setUser(Bruker user) {  
        this.user = user;  
    }  
      
    public void save(ActionEvent actionEvent) {  
        //Persist user  
          
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + user.getName());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
      
    public boolean isSkip() {  
        return skip;  
    }  
  
    public void setSkip(boolean skip) {  
        this.skip = skip;  
    }  
      
    public String onFlowProcess(FlowEvent event) {  
        logger.info("Current wizard step:" + event.getOldStep());  
        logger.info("Next step:" + event.getNewStep());  
          
        if(skip) {  
            skip = false;   //reset in case user goes back  
            return "confirm";  
        }  
        else {  
            return event.getNewStep();  
        }  
    }  
}  
    
}
