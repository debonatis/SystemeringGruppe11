/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

/**
 *
 * @author deb
 */
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.wideplay.warp.persist.Transactional;
import domain.Rett;
import java.util.List;
import javax.persistence.EntityManager;

public class RettRepositoryJPA implements RettRepository {
        
        @Inject 
        Provider<EntityManager> em; 
        
        @Transactional
    @Override
        public void createNew(Rett rett) {
                em.get().persist(rett);
        }

        @SuppressWarnings("unchecked")
    @Override
        public List<Rett> findAlt() {
                return em.get().createQuery("fra Rett").getResultList();
        }
}

