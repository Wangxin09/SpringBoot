package com.example.demo.repository;

import com.example.demo.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


/**
 * Created by 欣 on 2018/3/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private  ProductCategoryRepository repository;
    @Test
    public  void findOneTest(){
      ProductCategory productCategory= repository.findOne(1);
       String data= productCategory.toString();
       System.out.print(data);
    }
   /* @Test
    public  void saveObject(){
        ProductCategory productCategory=  new ProductCategory();
        productCategory.setCategoryType(7);
        productCategory.setCategoryName("低热量");
        repository.save(productCategory);
    }*/
    //更新需要设置组件
   /* @Test
    public  void updateObject(){
        ProductCategory productCategory=  new ProductCategory();
        productCategory.setCategoryId(6);
        productCategory.setCategoryType(3);
        productCategory.setCategoryName("高热量");
        repository.save(productCategory);

    }
*/
   /* @Test
    public  void updateObjects(){
        ProductCategory productCategory= repository.findOne(5);
        //ProductCategory productCategory=  new ProductCategory();
       // productCategory.setCategoryId(6);
        productCategory.setCategoryType(9);
        productCategory.setCategoryName("A套餐");
        repository.save(productCategory);
    }*/

    @Test
    public  void updateObjectOk(){
        ProductCategory productCategory= new ProductCategory("女生最爱",10);
        ProductCategory result= repository.save(productCategory);
        Assert.assertNotNull(result);
       // Assert.assertNotEquals(null,result);
    }
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list= Arrays.asList(5,6,7);
        List<ProductCategory> result= repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
        System.out.print(result.size());

    }
}