package com.example.client;

import com.example.dao.ProductDAO;
import com.example.dao.impl.ProductDAOImpl;
import com.example.entity.ProductEntity;

public class Tester {
    public static void main(String[] args) {
        ProductDAO dao=new ProductDAOImpl();
        ProductEntity p=new ProductEntity();
        p.setProductId(103);
        p.setProductName("life_boy");
        p.setQuantity(100);
        p.setUnitPrice(80.0);
//        p.setCreatedOn(12:35);
//        p.setUpdateOn();
        dao.saveProduct(p);
        System.out.println(p);

        ProductEntity p1= dao.updateProductById(101,45.0);
        System.out.println(p1);

    }

}
