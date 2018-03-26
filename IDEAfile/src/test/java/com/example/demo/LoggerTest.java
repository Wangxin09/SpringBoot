package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 欣 on 2018/3/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    /* private  final Logger logger= LoggerFactory.getLogger(LoggerTest.class);
    //LoggerTest.class--》日志会显示打印当前类的名称
    // 2018-03-21 11:07:56.863  INFO 3248 --- [main] com.example.demo.LoggerTest  : info ...
    @Test
    public  void test1(){
        //变量的输出   {}占位符
        String name="demo";
        String pass="123456";
        logger.info("name:{},pass:{} ",name,pass);
        logger.info("name:"+name+"，pass:"+pass);
        logger.info("info ...");
        logger.debug("debug ...");
        logger.error("error ...");
        logger.warn("warn ...");
    }*/
   @Test
    public  void test2(){
        log.info("info ...");
        log.debug("debug ...");
        log.error("error ...");
    }
}
