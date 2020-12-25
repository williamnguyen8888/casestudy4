package com.williamnews.Service;

import com.williamnews.model.AccountEntity;
import com.williamnews.model.LoginEntity;

import java.util.Optional;

public interface IAccountService {
    Iterable<AccountEntity> findAll();
    Optional<AccountEntity> findById(int id);
    void save(AccountEntity accountEntity);
    void deleteById(int id);
    AccountEntity checkLogin(LoginEntity loginEntity);
}
