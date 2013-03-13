package application;

import com.google.inject.AbstractModule;
import repository.OrdreRepository;
import repository.OrdreRepositoryJPA;

/**
 *
 * @author deb
 */
public class RepositoryModuleOrdre extends AbstractModule{
   
    @Override
    protected void configure() {
        binder().bind(OrdreRepository.class).to(OrdreRepositoryJPA.class);
    }
}
