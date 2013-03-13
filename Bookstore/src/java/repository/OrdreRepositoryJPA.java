/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.wideplay.warp.persist.Transactional;
import domain.Ordre;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author deb
 */
public class OrdreRepositoryJPA implements OrdreRepository{
    @Inject
    Provider<EntityManager> em;

    @Transactional
    @Override
    public void createNew(Ordre ordre) {
        em.get().persist(ordre);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Ordre> findAlt() {
        return em.get().createQuery("fra Ordre").getResultList();
    }
}
