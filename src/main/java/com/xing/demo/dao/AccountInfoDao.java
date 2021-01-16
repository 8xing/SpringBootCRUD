package com.xing.demo.dao;

import com.xing.demo.entity.AccountInfo;
import com.xing.demo.entity.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Component
public interface AccountInfoDao {
    //通过用户名查询用户名和密码
    @Select("select account,password,uid from AccountInfo where account=#{account}")
    AccountInfo login(@Param("account") String account);
    //注册
    @Insert("insert into AccountInfo values  (null ,#{account},#{password},#{phone},#{email},#{gitee},#{github},#{uid})")
    void register(AccountInfo accountInfo);
    //通过用户名查询所有信息(AccountInfo)
    @Select("select * from AccountInfo where account=#{account}")
    AccountInfo selectInfo(@Param("account") String account);
    //通过uid查询所有信息(UserInfo)
    @Select("select * from UserInfo where id=#{uid}")
    UserInfo selectUser(@Param("uid") Long uid);
    //删除全部信息
    @Delete("delete from AccountInfo where uid=#{uid}")
    void deleteInfo(@Param("uid")Long uid);
    @Delete("delete from UserInfo where id=#{uid}")
    void  deleteUser(@Param("uid")Long uid);
    //通过uid修改用户信息(UserInfo)
    @Update("update UserInfo set name=#{name},sex=#{sex},age=#{age},address=#{address} where id=#{id}")
    void modifiyUser(UserInfo userInfo);
    //通过id修改用户信息(AccountInfo)
    @Update("update AccountInfo set account=#{account},password=#{password},phone=#{phone},email=#{email} where uid=#{uid}")
    void modifiyAccount(AccountInfo accountInfo);
}
