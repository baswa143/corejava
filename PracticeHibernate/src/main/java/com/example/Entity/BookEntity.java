package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book")
public class BookEntity {
    @Id
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name="book_name")
    private String BookName;

    @Column(name = "book_price")
    private Double BookPrice;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public Double getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        BookPrice = bookPrice;
    }
}
