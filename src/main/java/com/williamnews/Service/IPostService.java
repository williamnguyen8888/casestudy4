package com.williamnews.Service;

import com.williamnews.model.PostEntity;

import java.util.Optional;

public interface IPostService {
    Iterable<PostEntity> findAll();
    Optional<PostEntity> findById(int id);
    void save(PostEntity postEntity);
    void deleteById(int id);
}
