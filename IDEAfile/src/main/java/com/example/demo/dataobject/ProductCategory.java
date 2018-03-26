package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 类目表
 * Created by 欣 on 2018/3/21.
 */
//@Table( name="定义自己表名") 表名与类名默认一致
//@GeneratedValue  自增
//@DynamicUpdate  时间更新
@Entity
//@Data
@DynamicUpdate
public class ProductCategory {
    //类目ID
    @Id
    @GeneratedValue
    private Integer categoryId;
    //类目名字
    private  String categoryName;
    //类目编号
    private  Integer categoryType;

    public ProductCategory(){

    }
    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    // private Date createTime;

   //  private  Date updateTime;



    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

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



    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +'}';
    }
}
