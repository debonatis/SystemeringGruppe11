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
import java.io.Serializable;
import java.util.List;
import org.primefaces.optimus.config.Scope;
import org.primefaces.optimus.config.annotations.Controller;
import repository.RettRepository;

@Controller(name="finnRettController", scope=Scope.VIEW)
public class FinnRettController implements Serializable {

        private List<Rett> retter;

        private Rett rett;
        
        private RettRepository rettRepository;
        
        @Inject
        public FinnRettController(RettRepository bookRepository) {
                this.rettRepository = bookRepository;
                
                retter = this.rettRepository.findAlt();
        }
        
        public Rett getRett() {
                return rett;
        }
        public void setRett(Rett rett) {
                this.rett = rett;
        }
        
        public List<Rett> getRetter() {
                return retter;
        }
        public void setRetter(List<Rett> retter) {
                this.retter = retter;
        }
}

