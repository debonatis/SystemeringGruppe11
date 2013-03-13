/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

/**
 *
 * @author deb
 */
import java.util.List;

import javax.persistence.EntityManager;



import com.google.inject.Inject;
import com.google.inject.Provider;
import com.wideplay.warp.persist.Transactional;
import domain.Book;

public class BookRepositoryJPA implements BookRepository {
        
        @Inject 
        Provider<EntityManager> em; 
        
        @Transactional
    @Override
        public void createNew(Book book) {
                em.get().persist(book);
        }

        @SuppressWarnings("unchecked")
    @Override
        public List<Book> findAll() {
                return em.get().createQuery("from Book").getResultList();
        }
}

