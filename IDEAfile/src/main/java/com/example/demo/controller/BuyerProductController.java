package com.example.demo.controller;

import com.example.demo.dataobject.ProductCategory;
import com.example.demo.dataobject.ProductInfo;
import com.example.demo.service.ProductCategoryService;
import com.example.demo.service.ProductInfoService;
import com.example.demo.utils.ResultUtils;
import com.example.demo.vo.ProductInfoVo;
import com.example.demo.vo.ProductVo;
import com.example.demo.vo.ResultBuyerVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 买家商品相关详情
 * Created by 欣 on 2018/3/23.
 */

@RequestMapping("/buyer/product")
@RestController
public class BuyerProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public ResultBuyerVo list(){
        //1查询所有上架的商品
        List<ProductInfo> infoList = productInfoService.findUpAll(0);
        //2查询类目(一次性的查询)---重点---(1)遍历infoList得到商品，再根据商品得到类目编号CategoryType，
        // (2)添加CategoryType到集合categoryTypeList中
        ArrayList<Integer> categoryTypeList = new ArrayList<>();

        for (ProductInfo productInfo :infoList  ){
            //添加商品的类目编号到categoryTypeList集合中
            categoryTypeList.add(productInfo.getCategoryType());
        }
        //(3)根据categoryTypeList集合得到ProductCategory商品类目LIst
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);
        //3数据拼装
        // 1)遍历类目
        List<ProductVo> productVoList=new ArrayList<>();
        for (ProductCategory  productCategory:productCategoryList) {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());

            // 2)遍历商品详情
            List<ProductInfoVo> productInfoVoList=new ArrayList<>();
            for (ProductInfo productInfo:infoList) {
                // 3)商品类目类型的判断
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVo infoVo = new ProductInfoVo();
                  /*  infoVo.setProductId(productInfo.getProductId());
                    infoVo.setProductName();
                    infoVo.setProductIcon();
                    infoVo.setProductPrice();
                    infoVo.setProductDescription();*/
                    BeanUtils.copyProperties(productInfo,infoVo);
                    productInfoVoList.add(infoVo);
                }

            }
            productVo.setProductInfoVoList(productInfoVoList);
            productVoList.add(productVo);
        }


        // 第一种
       /* ResultBuyerVo resultBuyerVo = new ResultBuyerVo();
        resultBuyerVo.setData(productVoList);
        resultBuyerVo.setCode(0);
        resultBuyerVo.setMsg("成功");
        return  resultBuyerVo;*/
        //第二种
        return ResultUtils.success(productVoList);



       /* ProductVo productVo = new ProductVo();
        ProductVo productVo = new ProductVo();
        productVo.setCategoryName("tese");
        productVo.setCategoryType(12);

        resultBuyerVo.setData(Arrays.asList(productVo));

        ProductInfoVo productInfoVo = new ProductInfoVo();
        productInfoVo.setProductName("饮品");
        productInfoVo.setProductDescription("绿色，有机");
        //productInfoVo.setProductPrice();
        productInfoVo.setProductIcon("www.baidu.com");
        productVo.setProductInfoVoList(Arrays.asList(productInfoVo));


        return  resultBuyerVo;*/
    }
}
