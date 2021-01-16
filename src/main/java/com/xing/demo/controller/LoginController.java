package com.xing.demo.controller;

import com.xing.demo.entity.AccountInfo;
import com.xing.demo.entity.UserInfo;
import com.xing.demo.service.AccountInfoService;
import com.xing.demo.vo.JwtUtils;
import com.xing.demo.vo.ResultJSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@Slf4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/website/")
public class LoginController {

    @Autowired
    AccountInfoService accountInfoService;

    //用户登录
    @GetMapping("login")
    public ResultJSON login(@RequestParam("account") String account,@RequestParam("password") String password){
        AccountInfo info1=accountInfoService.login(account,password);
        String userAccount=info1.getAccount();
        String userPssword=info1.getPassword();
        String accounts=info1.getAccount();
        Map<String, Object> map = new HashMap<>();
        if (userAccount.equals(account)&&userPssword.equals(password)){
            if (account != null) {
                String token = JwtUtils.sign(info1.getAccount(), info1.getPassword());
                if (token != null) {
                    map.put("account", account);
                    map.put("status", "success");
                    map.put("token", token);
                }
            }
            return  new ResultJSON("登录成功!",map);
        }else {
            map.put("status", "error");
            map.put("message", "token过期");
            return  new ResultJSON(201,"登录失败!",map);
        }

    }

    //注册
    @PostMapping("register")
    public ResultJSON register(AccountInfo accountInfo){
       accountInfoService.register(accountInfo);
        return  new ResultJSON("注册成功！");
    }
    //删除
    @GetMapping("delete/{account}")
    public ResultJSON delete(@PathVariable("account") String account){
        accountInfoService.deleteInfo(account);
        return  new ResultJSON("删除成功！");
    }

    //列表查询
    @GetMapping("/findAll/{account}")
    public ResultJSON findAll(@PathVariable("account") String account){
        AccountInfo info=accountInfoService.selectInfo(account);
        return  new ResultJSON("查询成功",info);
    }

    //修改用户信息
    @PostMapping("modifiyUser")
    public ResultJSON modifiyUser(UserInfo userInfo){
         accountInfoService.modifiyUser(userInfo);
        return  new ResultJSON("修改成功");
    }
    //修改用户信息
    @PostMapping("modifiyAccount")
    public ResultJSON modifiyAccount(AccountInfo accountInfo){
        accountInfoService.modifiyAccount(accountInfo);
        return  new ResultJSON("修改成功");
    }

    //详情查询
    @GetMapping("details/{account}")
    public ResultJSON details(@PathVariable("account")String account){
        AccountInfo info=accountInfoService.selectInfo(account);
        Long uid=info.getUid();
        UserInfo userInfo=accountInfoService.selectUser(uid);
        info.setUser(userInfo);
        System.out.println(info);
        System.out.println(userInfo);
        return  new ResultJSON("查询成功！",info);
    }

}
