package com.example.demo.enums;

/**
 * 支付状态 默认为0
 * Created by 欣 on 2018/3/24.
 */
public enum PayStatusEnum {
    WAIT(0,"未支付"),
    SUCCESS(1,"支付成功"),
    ;

    private  Integer code;

    private String  message;

    PayStatusEnum(Integer code,String  message){
        this.code=code;
        this.message=message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
