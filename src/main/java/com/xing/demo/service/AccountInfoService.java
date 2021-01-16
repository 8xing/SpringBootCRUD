package com.xing.demo.service;

import com.xing.demo.entity.AccountInfo;
import com.xing.demo.entity.UserInfo;

public interface AccountInfoService {
    AccountInfo login(String account, String password);

    void register(AccountInfo accountInfo);

    AccountInfo selectInfo(String account);

    AccountInfo selectAll(String account);

    UserInfo selectUser(Long uid);

    void deleteInfo(String account);


    void modifiyUser(UserInfo userInfo);

    void modifiyAccount(AccountInfo accountInfo);
}
