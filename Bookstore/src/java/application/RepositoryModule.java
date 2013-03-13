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
import repository.RettRepository;
import repository.RettRepositoryJPA;

public class RepositoryModule extends AbstractModule {

    @Override
    protected void configure() {
        binder().bind(RettRepository.class).to(RettRepositoryJPA.class);
    }
}
