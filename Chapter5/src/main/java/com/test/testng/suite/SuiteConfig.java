package com.test.testng.suite;
import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite 运行啦");
    }

}
