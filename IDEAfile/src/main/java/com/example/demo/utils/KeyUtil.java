package com.example.demo.utils;

import java.util.Random;

/**
 * Created by 欣 on 2018/3/24.
 */
public class KeyUtil {

    /**生成唯一主键
     * 格式：时间+随机数
     * */
   public  static synchronized String getKey(){

       Random random=new Random();
       Integer number = random.nextInt(9000000) + 1000000;
       return System.currentTimeMillis()+String.valueOf(number);
   }
}
