package com.test.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行之后运行的方法");
    }

    //在类运行之前运行的
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    //在类运行之后运行的
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.print("这是第一个测试用例");
    }

    @Test
    public void testCase2(){
        System.out.println("这是第二个测试用例");
    }
    //这是在测试方法之前执行的
    @BeforeMethod
    public void beforeMethod(){
        System.out.print("这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法之后运行的");
    }
}
