package com.example.demo.utils;

import com.example.demo.vo.ResultBuyerVo;

/**
 * Created by 欣 on 2018/3/23.
 */
public class ResultUtils {

    public static ResultBuyerVo success(Object object){
        ResultBuyerVo resultBuyerVo = new ResultBuyerVo();
        resultBuyerVo.setData(object);
        resultBuyerVo.setCode(0);
        resultBuyerVo.setMsg("成功");
        return resultBuyerVo;
    }
    public static ResultBuyerVo success( ){
        return success(null);
    }

   /* public static ResultBuyerVo errors(Object object){
        ResultBuyerVo resultBuyerVo = new ResultBuyerVo();
        resultBuyerVo.setData(object);
        resultBuyerVo.setCode(1);
        resultBuyerVo.setMsg("失败");
        return resultBuyerVo;
    }*/

    public static ResultBuyerVo error(Integer code,String msg){
        ResultBuyerVo resultBuyerVo = new ResultBuyerVo();
        resultBuyerVo.setCode(code);
        resultBuyerVo.setMsg(msg);
        return resultBuyerVo;
    }
}
