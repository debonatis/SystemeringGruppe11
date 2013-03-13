/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import domain.Bruker;
import java.util.List;

/**
 *
 * @author deb
 */
public interface BrukerRepository {

    public void createNew(Bruker bruker);

    public List<Bruker> findAlt();
}
