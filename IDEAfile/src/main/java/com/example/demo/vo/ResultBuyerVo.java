package com.example.demo.vo;



/**
 * 买家显示信息
 * http请求返回的最外层View对象
 * Created by 欣 on 2018/3/23.
 */

public class ResultBuyerVo<T> {
    //错误码
    private  Integer code;
    //提示信息
    private  String msg;
    //data返回一个对象具体内容
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultBuyerVo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
