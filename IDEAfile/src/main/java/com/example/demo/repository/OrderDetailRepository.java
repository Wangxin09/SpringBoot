package com.example.demo.repository;

import com.example.demo.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 订单详情Dao
 * Created by 欣 on 2018/3/24.
 */
public interface OrderDetailRepository extends JpaRepository <OrderDetail,String> {
    //一个订单表对应多个订单详情表
    //根据订单ID查找
    List<OrderDetail> findByOrderId(String orderId);
}
