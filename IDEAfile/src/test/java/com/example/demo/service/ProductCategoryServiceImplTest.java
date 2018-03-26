package com.example.demo.service;

import com.example.demo.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 欣 on 2018/3/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    private  final Logger logger=LoggerFactory.getLogger(ProductCategoryServiceImplTest.class);

    //ProductCategoryServiceImpl根据类名的接口实现的
    @Autowired
    private  ProductCategoryServiceImpl categoryService;
    @Test
    public void  findOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(5);
        logger.info("findOne"+productCategory.toString());
    }

    @Test
    public void findAll() throws Exception {
        for (ProductCategory category : categoryService.findAll()) {
            logger.info(category.toString());
        }
        ;
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
       List<ProductCategory>  category =categoryService.findByCategoryTypeIn(Arrays.asList(1,5,6,7));
        Assert.assertNotEquals(0,category.size());

    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("凉品", 11);

        ProductCategory result = categoryService.save(productCategory);

        Assert.assertNotNull(result);
    }

}