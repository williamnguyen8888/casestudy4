package com.williamnews.Repository;

import com.williamnews.model.AccountEntity;
import com.williamnews.model.LoginEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends CrudRepository<AccountEntity, Integer> {

}
