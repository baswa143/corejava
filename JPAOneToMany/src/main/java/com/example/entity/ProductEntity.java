package com.example.entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "tbl_product")
public class ProductEntity {
    @Id
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String ProductName;

     @Lob
    @Column(name = "product_img")
    private byte[] productImage;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }
}
