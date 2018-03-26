package com.example.demo.repository;

import com.example.demo.dataobject.OrderMaster;
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

import static org.junit.Assert.*;

/**
 * Created by 欣 on 2018/3/24.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    private Logger logger= LoggerFactory.getLogger(OrderMasterRepositoryTest.class);

    private final String OPENID="123123";
    @Test
    public void save() throws Exception {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("122");
        orderMaster.setBuyerAddress("西安市高新路");
        orderMaster.setBuyerName("金坷垃");
        orderMaster.setBuyerOpenid("123103");
        orderMaster.setBuyerPhone("12345675911");
        orderMaster.setOrderAmount(new BigDecimal(9.5));
        //orderMaster.setPayStatus();
        //orderMaster.setOrderStatus();
        OrderMaster master = repository.save(orderMaster);
        logger.error("save"+master.toString());
    }
    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest pageRequest = new PageRequest(0,5);
        Page<OrderMaster> page = repository.findByBuyerOpenid(OPENID, pageRequest);
        System.out.println("总条数"+page.getTotalElements());
        System.out.println("总页数"+page.getTotalPages());
        System.out.println("详情"+page.getContent().toString());
    }

}