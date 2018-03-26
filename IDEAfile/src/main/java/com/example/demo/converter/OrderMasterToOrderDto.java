package com.example.demo.converter;

import com.example.demo.dataobject.OrderMaster;
import com.example.demo.dto.OrderDto;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 欣 on 2018/3/25.
 */
public class OrderMasterToOrderDto {

    public  static OrderDto convet(OrderMaster orderMaster){

        OrderDto orderDto = new OrderDto();
        BeanUtils.copyProperties(orderMaster,orderDto);
        return orderDto;
    }

    public  static List<OrderDto> convet(List<OrderMaster> orderMasterList){
        ArrayList<OrderDto> dtoArrayList = new ArrayList<>();

        for (int i=0;i<orderMasterList.size();i++){
            OrderDto orderDto = new OrderDto();
            BeanUtils.copyProperties(orderMasterList.get(i),orderDto);
            dtoArrayList.add(orderDto);
        }
        //orderMasterList.add(orderDto);
        return dtoArrayList;
    }
}
