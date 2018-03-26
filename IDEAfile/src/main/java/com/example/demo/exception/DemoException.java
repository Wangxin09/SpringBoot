package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;

/**
 * 异常处理
 * Created by 欣 on 2018/3/24.
 */
public class DemoException  extends  RuntimeException{

    private Integer code;

    public DemoException(ResultEnum  resultEnum) {
        //因为RuntimeException类有message方法，需要重写
       super(resultEnum.getMessage());
       this.code=resultEnum.getCode();
    }

    public DemoException() {

    }
    public DemoException(Integer code,String message) {
        super(message);
        this.code=code;
    }
}
