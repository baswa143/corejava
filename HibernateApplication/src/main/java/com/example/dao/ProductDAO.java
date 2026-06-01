package com.example.dao;

import com.example.entity.ProductEntity;

public interface ProductDAO {
    ProductEntity saveProduct(ProductEntity product);
    ProductEntity loadProductById(Integer productId);
    ProductEntity updateProductById(Integer productId,Double new_unit_price);
    void deleteProductByID(Integer productId);
}
