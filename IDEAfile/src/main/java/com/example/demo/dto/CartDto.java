package com.example.demo.dto;


/**
 * 购物车
 * Created by 欣 on 2018/3/24.
 */
public class CartDto {

    //商品中的商品ID

    private String productId;
    //订单详情中的商品库存
    private Integer  productQuantity;

    public CartDto(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
}
