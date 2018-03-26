package com.example.demo.service;

import com.example.demo.dataobject.ProductCategory;
import com.example.demo.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目service
 * Created by 欣 on 2018/3/21.
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository repository;
    /**
     * 卖家根据类目ID查找类目
     * */
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }
    /**
     * 卖家查询全部类目表
     * */
    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }
    //买家查找---类目编号
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }
    /**
     * 卖家更新于保存
     * */
    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
