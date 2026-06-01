package com.example.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_Book")
public class BookEntity {
    @Id
    @Column(name = "Book_Id")
    private Integer bookId;

    @Column(name = "Book_Name")
    private String bookName;

    @Column(name = "Book_price")
    private Double bookPrice;

    @Column(name = "Created_On")
    @CreationTimestamp
    private LocalDateTime created_On;

    @Column(name = "Updated_On")
    @UpdateTimestamp
    private LocalDateTime updated_On;

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

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public LocalDateTime getCreated_On() {
        return created_On;
    }

    public void setCreated_On(LocalDateTime created_On) {
        this.created_On = created_On;
    }

    public LocalDateTime getUpdated_On() {
        return updated_On;
    }

    public void setUpdated_On(LocalDateTime updated_On) {
        this.updated_On = updated_On;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", created_On=" + created_On +
                ", updated_On=" + updated_On +
                '}';
    }
}
