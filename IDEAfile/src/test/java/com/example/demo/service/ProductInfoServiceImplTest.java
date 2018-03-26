package com.example.demo.service;

import com.example.demo.dataobject.ProductInfo;
import com.example.demo.repository.ProductInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 根据ProductInfoServiceImpl接口实现测试
 * Created by 欣 on 2018/3/23.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoServiceImplTest {
    private Logger logger= LoggerFactory.getLogger(ProductCategoryServiceImplTest.class);
    @Autowired
    private ProductInfoServiceImpl service;
    @Test
    public void findOne() throws Exception {
        ProductInfo info = service.findOne("123456");
        logger.error("errorfindone"+info);
        logger.debug("debugfindone"+info);
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> list = service.findUpAll(0);
        for(int i=0;i<list.size();i++){
            logger.error("findUpAll"+list.get(i).toString());
        }
    }

    //这里是pageRequest不是pageable，pageable是接口
    @Test
    public void findAll() throws Exception {

        PageRequest pageRequest = new PageRequest(0,2);
       // pageRequest.getSort();
        Page<ProductInfo> page = service.findAll(pageRequest);
        long l = page.getTotalElements();
        int i = page.getTotalPages();
        System.out.println(page.getNumber());
        System.out.print("page---"+l);
        System.out.println(page.getContent());

    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123000");
        productInfo.setProductName("玉米粥");
        //特别注意这里的输入值
        productInfo.setProductPrice(new BigDecimal(2.5));
        productInfo.setProductStock(6);
        productInfo.setProductDescription("营养，健康，美味");
        productInfo.setProductStatus(0);
        productInfo.setProductIcon("\u202AC:\\Users\\欣\\Pictures\\b.jpg");
        productInfo.setCategoryType(2);
        ProductInfo info = service.save(productInfo);
    }

}