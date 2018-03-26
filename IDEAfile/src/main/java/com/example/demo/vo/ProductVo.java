package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * 商品包含类目
 * Created by 欣 on 2018/3/23.
 */


public class ProductVo {

    //商品类目名称
    @JsonProperty("name")
    private String categoryName;
    //商品类目编号
    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVoList;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public List<ProductInfoVo> getProductInfoVoList() {
        return productInfoVoList;
    }

    public void setProductInfoVoList(List<ProductInfoVo> productInfoVoList) {
        this.productInfoVoList = productInfoVoList;
    }

    @Override
    public String toString() {
        return "ProductVo{" +
                "categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                ", productInfoVoList=" + productInfoVoList +
                '}';
    }
}
