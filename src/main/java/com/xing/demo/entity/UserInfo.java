package com.xing.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors
public class UserInfo {

  //用户id
  private Long id;
  //用户姓名
  private String name;
  //用户性别
  private String sex;
  //用户年龄
  private long age;
  //用户居住地
  private String address;


}
