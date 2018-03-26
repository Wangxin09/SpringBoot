package com.example.demo.service;

import com.example.demo.dataobject.ProductInfo;
import com.example.demo.dto.CartDto;
import com.example.demo.enums.ProductStatusEnum;
import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.DemoException;
import com.example.demo.repository.OrderDetailRepository;
import com.example.demo.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品
 * Created by 欣 on 2018/3/23.
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoRepository repository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    @Transactional
    public void increaseStock(List<CartDto> cartDtoList) {
        for (CartDto cartDto:cartDtoList){
            //根据商品ID查找商品
            ProductInfo productInfo = repository.findOne(cartDto.getProductId());
            if(productInfo==null){
                throw  new DemoException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer num = productInfo.getProductStock() +cartDto.getProductQuantity();
            if(num<0){
                throw  new DemoException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            productInfo.setProductStock(num);
            repository.save(productInfo);
        }

    }

    @Override
    @Transactional
    public void decreateStock(List<CartDto> cartDtoList) {
        for (CartDto cartDto:cartDtoList){
            //根据商品ID查找商品
            ProductInfo productInfo = repository.findOne(cartDto.getProductId());
            if(productInfo==null){
                throw  new DemoException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer num = productInfo.getProductStock() - cartDto.getProductQuantity();
            if(num<0){
                throw  new DemoException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            productInfo.setProductStock(num);
            repository.save(productInfo);
        }

    }

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll(Integer productStatus) {
        return  repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
