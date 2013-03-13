/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.wideplay.warp.persist.Transactional;
import domain.Bruker;
import domain.Rett;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author deb
 */
public class BrukerRepositoryJPA implements BrukerRepository {

    @Inject
    Provider<EntityManager> em;

    @Transactional
    @Override
    public void createNew(Bruker bruker) {
        em.get().persist(bruker);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Bruker> findAlt() {
        return em.get().createQuery("fra Bruker").getResultList();
    }
}
