package com.williamnews.Service;

import com.williamnews.Repository.IAccountRepository;
import com.williamnews.model.AccountEntity;
import com.williamnews.model.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
@Service
public class AccountService implements IAccountService {
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private IAccountRepository accountRepository;

    @Override
    public Iterable<AccountEntity> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<AccountEntity> findById(int id) {
        return accountRepository.findById(id);
    }

    @Override
    public void save(AccountEntity accountEntity) {
        accountRepository.save(accountEntity);
    }

    @Override
    public void deleteById(int id) {
        accountRepository.deleteById(id);
    }

    @Override
    public AccountEntity checkLogin(LoginEntity loginEntity) {
        Query query = entityManager.createQuery(
                "SELECT a FROM AccountEntity a WHERE a.userName= ?1 AND a.password= ?2");
        query.setParameter(1, loginEntity.getUserName());
        query.setParameter(2, loginEntity.getPassword());
        List<AccountEntity> accountEntity = query.getResultList();
        if (accountEntity.isEmpty()) {
            return null;
        }
        return accountEntity.get(0);
    }
}
