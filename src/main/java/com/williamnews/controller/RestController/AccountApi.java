package com.williamnews.controller.RestController;

import com.williamnews.Service.IAccountService;
import com.williamnews.model.AccountEntity;
import com.williamnews.model.LoginEntity;
import com.williamnews.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AccountApi {
    @Autowired
    private IAccountService AccountService;

    Response rs = new Response();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response loginApi(@RequestBody LoginEntity Login, HttpSession session) {
        AccountEntity account = AccountService.checkLogin(Login);
        if (account == null){
            rs.setStatus(rs.ERROR);
            rs.setMessage("ERROR");
            return rs;
        }
        session.setAttribute("username", account.getUserName());
        session.setAttribute("userType",  account.getAccountType());
        rs.setData(account);
        rs.setStatus(rs.SUCCESS);
        rs.setMessage("Success");
        return rs;
    }
    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public Response loginApi() {
        Iterable<AccountEntity> accountList = AccountService.findAll();
        rs.setData(accountList);
        rs.setStatus(rs.SUCCESS);
        rs.setMessage("Success");
        return rs;
    }
    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public Response loginApi(@RequestBody AccountEntity accountEntity) {
        AccountService.save(accountEntity);
        rs.setData(accountEntity);
        rs.setStatus(rs.SUCCESS);
        rs.setMessage("Success");
        return rs;
    }
}
