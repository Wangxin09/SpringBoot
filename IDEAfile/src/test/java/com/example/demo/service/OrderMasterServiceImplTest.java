package com.example.demo.service;

import com.example.demo.dataobject.OrderDetail;
import com.example.demo.dto.OrderDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by 欣 on 2018/3/24.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMasterServiceImplTest {
    private  final Logger logger= LoggerFactory.getLogger(OrderMasterServiceImplTest.class);


    @Autowired
    private  OrderMasterServiceImpl  orderMasterService;
    @Test
    public void create() throws Exception {
        OrderDto orderDto = new OrderDto();
        orderDto.setBuyerAddress("高新规划路");
        orderDto.setBuyerName("大哥");
        orderDto.setBuyerPhone("12345679911");
        orderDto.setBuyerOpenid("123123");
        //购物车
        ArrayList<OrderDetail> objectArrayList = new ArrayList<>();
        OrderDetail detail = new OrderDetail();
        detail.setProductId("123000");
        detail.setProductQuantity(2);

        OrderDetail detail2 = new OrderDetail();
        detail2.setProductId("123636");
        detail2.setProductQuantity(2);
        objectArrayList.add(detail2);

        objectArrayList.add(detail);
        orderDto.setOrderDetailList(objectArrayList);
        OrderDto result = orderMasterService.create(orderDto);
        logger.error("logger"+result.toString());
    }

    @Test
    public void cancel() throws Exception {
    }

    @Test
    public void findOne() throws Exception {
        OrderDto orderDto = orderMasterService.findOne("15219770800731976275");
        logger.error("orderMasterService"+orderDto.toString());
    }
    @Test
    public void finiSh() throws Exception {
    }

    @Test
    public void pay() throws Exception {
    }

    @Test
    public void findByOrderId() throws Exception {
    }

    @Test
    public void findList() throws Exception {
    }

}