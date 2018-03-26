package com.example.demo.service;

import com.example.demo.dataobject.ProductInfo;
import com.example.demo.dto.CartDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品
 * Created by 欣 on 2018/3/23.
 */
@Service
public interface ProductInfoService {
    //根据商品ID查询
    ProductInfo findOne(String productId);
    //客户端查询全部的上架商品列表
    List<ProductInfo> findUpAll(Integer productStatus);
    //查询全部的商品列表---分页---使用Pageable返回的是Page对象
    Page<ProductInfo> findAll(Pageable pageable);
    //添加商品
    ProductInfo save(ProductInfo productInfo);
    //加库存---客户端取消订单
    void increaseStock(List<CartDto> cartDtoList);
    //减库存---客户端下订单
    void decreateStock(List<CartDto> cartDtoList);
}
