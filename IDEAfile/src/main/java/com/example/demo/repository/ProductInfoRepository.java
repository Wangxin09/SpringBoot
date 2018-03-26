package com.example.demo.repository;

import com.example.demo.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository 模式主要是封装数据查询和存储逻辑；
 * Repository 模式实际用途：更换、升级 ORM 引擎，不影响业务逻辑；
 * Created by 欣 on 2018/3/23.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

        //查询上架的商品
        List<ProductInfo> findByProductStatus(Integer productStatus);

}
