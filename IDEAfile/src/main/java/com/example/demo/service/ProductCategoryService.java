package com.example.demo.service;

import com.example.demo.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by 欣 on 2018/3/21.
 */
public interface ProductCategoryService {


    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    //客户端查找---根据类目编号
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList );

    ProductCategory save(ProductCategory productCategory);
}
