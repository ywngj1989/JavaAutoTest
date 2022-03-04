package com.test.testng.suite;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.w3c.dom.ls.LSOutput;

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
