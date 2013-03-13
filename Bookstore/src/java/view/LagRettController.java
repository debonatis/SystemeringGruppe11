/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



/**
 *
 * @author deb
 */

import com.google.inject.Inject;
import domain.Rett;
import java.awt.event.ActionEvent;
import org.primefaces.optimus.application.FacesMessages;
import org.primefaces.optimus.config.Scope;
import org.primefaces.optimus.config.annotations.Controller;
import repository.RettRepository;


@Controller(name="createBookController", scope=Scope.REQUEST)
public class LagRettController {

        private Rett rett = new Rett();
        
        private RettRepository bookRepository;
        
        @Inject 
        private FacesMessages messages;
        
        @Inject
        public LagRettController(RettRepository bookRepository) {
                this.bookRepository = bookRepository;
        }

        public Rett getBook() {
                return rett;
        }
        public void setBook(Rett rett) {
                this.rett = rett;
        }
        
        public void save(ActionEvent actionEvent) {
                bookRepository.createNew(rett);
                
                messages.addInfo("Completed", rett.getNavn() + " is saved");
                
                rett = new Rett();
        }
}
