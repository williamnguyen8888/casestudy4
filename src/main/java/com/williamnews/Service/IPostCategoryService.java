package com.williamnews.Service;

import com.williamnews.model.PostcategoryEntity;

import java.util.Optional;

public interface IPostCategoryService {
    Iterable<PostcategoryEntity> findAll();
    Optional<PostcategoryEntity> findById(int id);
    void save(PostcategoryEntity postcategory);
    void deleteById(int id);
}
