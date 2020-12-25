package com.williamnews.Repository;

import com.williamnews.model.PostEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IPostRepository extends PagingAndSortingRepository<PostEntity,Integer> {
}
