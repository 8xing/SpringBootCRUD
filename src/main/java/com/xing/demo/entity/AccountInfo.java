package com.xing.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class AccountInfo {
  //账户id
  private Long id;
  //用户id
  private Long uid;
  //用户的登录账号
  private String account;
  //用户登录的密码
  private String password;
  //用户手机号
  private String phone;
  //用户邮箱
  private String email;
  //用户的gitee账号
  private String gitee;
  //用户的github账号
  private String github;
  private  Object User;

}
