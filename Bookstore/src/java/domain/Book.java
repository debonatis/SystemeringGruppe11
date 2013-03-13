/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author deb
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Basic
        private String title;
        
        @Basic
        private String author;
        
        @Basic
        private Integer pages;
        
        @Basic
        private String publisher;
        
        @Basic
        private String isbn;
        
        @Basic
        private Double rate;

        public Book() {}

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }
        public void setTitle(String title) {
                this.title = title;
        }
        
        public String getAuthor() {
                return author;
        }
        public void setAuthor(String author) {
                this.author = author;
        }

        public Integer getPages() {
                return pages;
        }
        public void setPages(Integer pages) {
                this.pages = pages;
        }

        public String getPublisher() {
                return publisher;
        }
        public void setPublisher(String publisher) {
                this.publisher = publisher;
        }

        public String getIsbn() {
                return isbn;
        }
        public void setIsbn(String isbn) {
                this.isbn = isbn;
        }

        public Double getRate() {
                return rate;
        }
        public void setRate(Double rate) {
                this.rate = rate;
        }
}
