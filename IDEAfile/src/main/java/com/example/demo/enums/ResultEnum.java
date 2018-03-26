package com.example.demo.enums;

/**
 * 前段消息提示
 * Created by 欣 on 2018/3/24.
 */
public enum ResultEnum {
    PRODUCT_NOT_EXIST(404,"商品不存在"),
    PRODUCT_STOCK_ERROR(400,"商品库存不足"),
    ORDER_NOT_EXIST(401,"订单不存在"),
    ORDERDETA_NOT_EXIST(402,"订单详情不存在"),
    ;

    private  Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
