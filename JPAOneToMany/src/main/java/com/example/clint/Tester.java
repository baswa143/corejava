package com.example.clint;

import com.example.dao.CategoryDAO;
import com.example.dao.CategoryDAOImpl;
import com.example.entity.CategoryEntity;
import com.example.entity.ProductEntity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) throws IOException {
        CategoryDAO dao=new CategoryDAOImpl();

        CategoryEntity categoryEntity=new CategoryEntity();
        categoryEntity.setCategoryId(1104);
        categoryEntity.setCategoryName("Electronic");

        ProductEntity entity=new ProductEntity();
        entity.setProductId(10021);
        entity.setProductName("Mobile");

        File file =  new File("D:\\Appa\\20210809_170435.jpg");
        byte[] imageBytes = new byte[(int)file.length()];
        FileInputStream fis=new FileInputStream(file);
        fis.read(imageBytes);
        entity.setProductImage(imageBytes);

        ProductEntity entity1=new ProductEntity();
        entity1.setProductId(10022);
        entity1.setProductName("tv");

        File file1 =  new File("D:\\Appa\\20210809_170435.jpg");
        byte[] imageBytes_tv = new byte[(int)file1.length()];
        FileInputStream fis1=new FileInputStream(file1);
        fis1.read(imageBytes_tv);
        entity1.setProductImage(imageBytes_tv);
        List<ProductEntity> lstOfProduct= Arrays.asList(entity1,entity);
        dao.saveCategory(categoryEntity);




    }
}
