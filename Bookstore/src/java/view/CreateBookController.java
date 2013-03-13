/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



/**
 *
 * @author deb
 */

import com.google.inject.Inject;
import domain.Book;
import java.awt.event.ActionEvent;
import org.primefaces.optimus.application.FacesMessages;
import org.primefaces.optimus.config.Scope;
import org.primefaces.optimus.config.annotations.Controller;
import repository.BookRepository;


@Controller(name="createBookController", scope=Scope.REQUEST)
public class CreateBookController {

        private Book book = new Book();
        
        private BookRepository bookRepository;
        
        @Inject 
        private FacesMessages messages;
        
        @Inject
        public CreateBookController(BookRepository bookRepository) {
                this.bookRepository = bookRepository;
        }

        public Book getBook() {
                return book;
        }
        public void setBook(Book book) {
                this.book = book;
        }
        
        public void save(ActionEvent actionEvent) {
                bookRepository.createNew(book);
                
                messages.addInfo("Completed", book.getTitle() + " is saved");
                
                book = new Book();
        }
}
