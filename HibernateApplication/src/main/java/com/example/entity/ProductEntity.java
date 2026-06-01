package com.example.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="tbl_products")
public class ProductEntity {

    @Id
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    private Integer quantity;

    @Column(name = "unit_price")
    private Double unitPrice;

    @Column(name = "CREATED_ON")
    @CreationTimestamp   //creation time always be same
    private LocalDateTime createdOn;

    @Column(name = "LASTUPDATED_ON")
    @UpdateTimestamp  //update will be change
    private  LocalDateTime updateOn;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(LocalDateTime updateOn) {
        this.updateOn = updateOn;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", createdOn=" + createdOn +
                ", updateOn=" + updateOn +
                '}';
    }
}
