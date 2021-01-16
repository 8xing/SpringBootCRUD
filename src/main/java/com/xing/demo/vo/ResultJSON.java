package com.xing.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Configurable
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class ResultJSON {
    //状态码：200正常 201 表示失败
    private int code;
    //状态码对应的状态信息
    private String msg;
    //正常信息
    private Object data;

    public ResultJSON(String msg) {
        this.msg=msg;
    }

    public ResultJSON(String msg,Object data) {
        this.code=200;
        this.msg=msg;
        this.data=data;
    }
    public ResultJSON(Integer code,String msg) {
        this.code=201;
        this.msg=msg;
    }

    public ResultJSON(Throwable e) {
        this.code=201;
        this.msg=e.getMessage();
    }

}
