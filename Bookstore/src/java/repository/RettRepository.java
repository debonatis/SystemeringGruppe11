/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

/**
 *
 * @author deb
 */
import domain.Rett;
import java.util.List;



public interface RettRepository {

        public void createNew(Rett rett);
        
        public List<Rett> findAlt();
}