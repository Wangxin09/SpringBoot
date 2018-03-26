package com.example.demo.service;

import com.example.demo.dataobject.OrderMaster;
import com.example.demo.dto.OrderDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单表
 * Created by 欣 on 2018/3/24.
 */
@Service
public interface OrderMasterService {
    //创建订单
    OrderDto create(OrderDto orderDto);
    //查询单个订单
    OrderDto findOne(String orderId);
    //查询全部订单
    Page<OrderDto> findList (String buyerOpenid, Pageable pageable);

    //取消订单
    OrderDto cancel(OrderDto orderDto);
    //支付完结
    OrderDto finiSh(OrderDto orderDto);
    //支付订单
    OrderDto pay(OrderDto orderDto);

   //查询订单列表
   Page<OrderDto> findList(Pageable pageable);
}
