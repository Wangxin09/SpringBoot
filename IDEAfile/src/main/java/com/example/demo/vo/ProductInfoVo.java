package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品显示详情
 * Created by 欣 on 2018/3/23.
 */

public class ProductInfoVo {
    //商品ID
    @JsonProperty("id")
    private String productId;
    //商品名称
    @JsonProperty("name")
    private  String productName;
    //特别---》商品单价
    @JsonProperty("price")
    private BigDecimal productPrice;
    //商品描述
    @JsonProperty("description")
    private String productDescription;
    //商品图片
    @JsonProperty("icon")
    private  String  productIcon;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    @Override
    public String toString() {
        return "ProductInfoVo{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productDescription='" + productDescription + '\'' +
                ", productIcon='" + productIcon + '\'' +
                '}';
    }
}
