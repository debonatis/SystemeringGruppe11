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
import java.io.Serializable;
import java.util.List;
import org.primefaces.optimus.config.Scope;
import org.primefaces.optimus.config.annotations.Controller;
import repository.BookRepository;

@Controller(name="searchBooksController", scope=Scope.VIEW)
public class SearchBooksController implements Serializable {

        private List<Book> books;

        private Book book;
        
        private BookRepository bookRepository;
        
        @Inject
        public SearchBooksController(BookRepository bookRepository) {
                this.bookRepository = bookRepository;
                
                books = this.bookRepository.findAll();
        }
        
        public Book getBook() {
                return book;
        }
        public void setBook(Book book) {
                this.book = book;
        }
        
        public List<Book> getBooks() {
                return books;
        }
        public void setBooks(List<Book> books) {
                this.books = books;
        }
}

