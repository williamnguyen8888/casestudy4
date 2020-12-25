package com.williamnews.Repository;

import com.williamnews.model.PostcategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostCategoryRepository extends JpaRepository<PostcategoryEntity, Integer> {

}
