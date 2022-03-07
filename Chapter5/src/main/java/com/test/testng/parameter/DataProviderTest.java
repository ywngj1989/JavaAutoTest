package com.test.testng.parameter;

import javafx.beans.binding.ObjectExpression;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

   @Test(dataProvider = "data")
    public void testDataProviderTest(String name,int age){
        System.out.println("name="+name+";age="+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
       Object[][] o = new Object[][]{
               {"张三",10},
               {"李四",20},
               {"王五",30}
       };
       return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("这是test1方法 name="+name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("这是test2方法 name="+name+";age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
       Object[][]  result=null;
       if(method.getName().equals("test1")){

           result=new Object[][]{
                   {"王伟",10},
                   {"李武",25}
           };
       }else if(method.getName().equals("test2")){

            result=new Object[][]{
                    {"赵柳",56},
                    {"王刚",67}
            };
        }
       return result;
    }
}
