/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import com.google.inject.AbstractModule;
import repository.BrukerRepository;
import repository.BrukerRepositoryJPA;

/**
 *
 * @author deb
 */
public class RepositoryModuleBruker extends AbstractModule{
   
    @Override
    protected void configure() {
        binder().bind(BrukerRepository.class).to(BrukerRepositoryJPA.class);
    }
}
