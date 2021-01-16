package com.xing.demo.service.Impl;

import com.xing.demo.dao.AccountInfoDao;
import com.xing.demo.entity.AccountInfo;
import com.xing.demo.entity.UserInfo;
import com.xing.demo.service.AccountInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountInfoServiceImpl implements AccountInfoService {
    @Autowired
    private  AccountInfoDao accountInfoDao;
    @Override
    public AccountInfo login(String account, String password) {
        if (account==null||password==null){
            throw  new IllegalArgumentException("请完整填入数据");
        }
        AccountInfo info=accountInfoDao.login(account);

return  info;

    }

    @Override
    public void register(AccountInfo accountInfo) {
        if (accountInfo.getAccount()==null||accountInfo.getPassword()==null){
            throw new IllegalArgumentException("密码或者账号为必填栏目");
        }
        try {
            accountInfoDao.register(accountInfo);
        }catch (Exception e){
            e.printStackTrace();
            throw new IllegalArgumentException("注册失败");
        }

    }

    @Override
    public AccountInfo selectInfo(String account) {
        if (account==null){
            throw new IllegalArgumentException("必须传入用户账号！");
        }
        AccountInfo info = null;
        try {
            info=accountInfoDao.selectInfo(account);
        }catch (Exception e){
            log.error("查询成功");
        }
        return info;
    }

    @Override
    public AccountInfo selectAll(String account) {
        if (account==null){
            throw new IllegalArgumentException("必须传入用户账号！");
        }
        AccountInfo info=null;
        try {
            accountInfoDao.selectInfo(account);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return null;
    }

    @Override
    public UserInfo selectUser(Long uid) {
        UserInfo info=accountInfoDao.selectUser(uid);
        return  info;
    }


    @Override
    public void deleteInfo(String account) {
        if (account==null){
            throw  new IllegalArgumentException("必须传入用户名！");
        }
        AccountInfo info=accountInfoDao.selectInfo(account);
        long uid=info.getUid();
        try {
            accountInfoDao.deleteUser(uid);
            accountInfoDao.deleteInfo(uid);
        }catch (Exception e){
            log.error("删除失败！");
        }
    }

    @Override
    public void modifiyUser(UserInfo userInfo) {
        Long id=userInfo.getId();
        if (id == null){
            throw  new IllegalArgumentException("必须传入id");
        }
        try {
            accountInfoDao.modifiyUser(userInfo);
        }catch (Exception e){
            log.error("修改失败");
        }
    }

    @Override
    public void modifiyAccount(AccountInfo accountInfo) {
        Long uid=accountInfo.getUid();
        if (uid == null){
            throw  new IllegalArgumentException("必须传入uid");
        }
        try {
            accountInfoDao.modifiyAccount(accountInfo);
        }catch (Exception e){
            log.error("修改失败");
        }
    }


}
