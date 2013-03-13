/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.optimus.application;

/**
 *
 * @author deb
 */
public interface FacesMessages {

        public void addInfo(String summary, String detail);
        
        public void addError(String summary, String detail);
        
        public void addWarn(String summary, String detail);
        
        public void addFatal(String summary, String detail);
}

