package com.example.demo.repository;

import com.example.demo.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单表Dao
 * Created by 欣 on 2018/3/24.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    //根据买家的Openid查找订单并进行分页
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid,Pageable pageable);
}
