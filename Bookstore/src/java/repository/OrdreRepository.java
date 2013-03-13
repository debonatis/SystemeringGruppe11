/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import domain.Ordre;
import java.util.List;

/**
 *
 * @author deb
 */
public interface OrdreRepository {

    public void createNew(Ordre ordre);

    public List<Ordre> findAlt();
}
