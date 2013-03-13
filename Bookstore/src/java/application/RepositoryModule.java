/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author deb
 */


import com.google.inject.AbstractModule;
import repository.BookRepository;
import repository.BookRepositoryJPA;

public class RepositoryModule extends AbstractModule {

    @Override
    protected void configure() {
        binder().bind(BookRepository.class).to(BookRepositoryJPA.class);
    }
}
