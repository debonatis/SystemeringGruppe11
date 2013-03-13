/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

/**
 *
 * @author deb
 */
import domain.Book;
import java.util.List;



public interface BookRepository {

        public void createNew(Book book);
        
        public List<Book> findAll();
}