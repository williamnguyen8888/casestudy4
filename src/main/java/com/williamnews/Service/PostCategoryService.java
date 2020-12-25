package com.williamnews.Service;

import com.williamnews.Repository.IPostCategoryRepository;
import com.williamnews.model.PostcategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PostCategoryService implements IPostCategoryService {
    @Autowired
    private IPostCategoryRepository postCategoryRepository;

    @Override
    public Iterable<PostcategoryEntity> findAll() {
        return postCategoryRepository.findAll();
    }

    @Override
    public Optional<PostcategoryEntity> findById(int id) {
        return postCategoryRepository.findById(id);
    }

    @Override
    public void save(PostcategoryEntity postcategory) {
        postCategoryRepository.save(postcategory);
    }

    @Override
    public void deleteById(int id) {
        postCategoryRepository.deleteById(id);
    }
}
