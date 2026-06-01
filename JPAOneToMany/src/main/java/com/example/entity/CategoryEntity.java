package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_categories")
public class CategoryEntity {
    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id_fk")
    private List<CategoryEntity> lstOfProducts;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<CategoryEntity> getLstOfProducts() {
        return lstOfProducts;
    }

    public void setLstOfProducts(List<CategoryEntity> lstOfProducts) {
        this.lstOfProducts = lstOfProducts;
    }
}
