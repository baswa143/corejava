package com.ait.mtm.entities;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity
@Table(name = "tbl_books")
public class Book {
@Id
    @Column(name = "book_id")
    private Integer bookId;

@Column(name = "book_name")
    private String bookName;
@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinTable(name = "book_id",joinColumns = @JoinColumn(name="book_id",referencedColumnName = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id",referencedColumnName = "author_id")
)
private List<Author> authors;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +

                '}';
    }
}

