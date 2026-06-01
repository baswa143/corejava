package com.example.dao.impl;

import com.example.dao.ProductDAO;
import com.example.entity.ProductEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductDAOImpl implements ProductDAO {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
    @Override
    public ProductEntity saveProduct(ProductEntity product) {
        EntityManager entityManager=factory.createEntityManager();
        EntityTransaction tx=entityManager.getTransaction();
        tx.begin();
        try {
            entityManager.persist(product);
            tx.commit();
            System.out.println("product is inserted in database");
        }
        catch (Exception ex){
            tx.rollback();
            System.out.println("Error in inserting a product........"+ex);
        }
        finally {
            entityManager.close();
        }
        return product;
    }

    @Override
    public ProductEntity loadProductById(Integer productId) {
        EntityManager entityManager =factory.createEntityManager();
        ProductEntity p=entityManager.find(ProductEntity.class,productId);
        return p;
    }

    @Override
    public ProductEntity updateProductById(Integer productId, Double new_unit_price) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        ProductEntity p=em.find(ProductEntity.class,productId);
      if(p!=null){
          p.setUnitPrice(new_unit_price);
      }
        tx.commit();
        em.close();
        return p;
    }

    @Override
    public void deleteProductByID(Integer productId) {
        EntityManager em=factory.createEntityManager();
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        ProductEntity p=em.find(ProductEntity.class,productId);
        tx.commit();
        em.remove(p);
        em.close();



    }
}
