package com.example.dao;

import com.example.entity.CategoryEntity;

public interface CategoryDAO {
    void saveCategory(CategoryEntity entity);
    CategoryEntity fetchCategory(Integer categoryId);
    void removeCategory(Integer categoryId);
}
