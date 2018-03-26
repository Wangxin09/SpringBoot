package com.example.demo.repository;

import com.example.demo.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 欣 on 2018/3/24.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    private Logger logger= LoggerFactory.getLogger(OrderMasterRepositoryTest.class);

    @Test
    public void save(){
        OrderDetail detail = new OrderDetail();
        detail.setDetailId("132");
        detail.setOrderId("101");
        detail.setProductIcon("chrome://downloadgfs/ojyjb");
        detail.setProductName("天分");
        detail.setProductId("12321");
        detail.setProductPrice(new BigDecimal(8.5));
        detail.setProductQuantity(10);
        OrderDetail result= repository.save(detail);
       // OrderDetail save = repository.save(detail);
        Assert.assertNotNull(result);

    }
    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("101");
        for(int i=0;i<orderDetailList.size();i++){
            logger.error(orderDetailList.get(i).toString());
        }
    }

}