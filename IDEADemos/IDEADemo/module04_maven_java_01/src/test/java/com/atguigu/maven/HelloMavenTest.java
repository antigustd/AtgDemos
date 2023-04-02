package com.atguigu.maven;

import org.junit.Test;

/**
 * ClassName: HelloMavenTest
 * Package: com.atguigu.maven
 * Description:
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 2022/10/22 - 22:00
 * @Version: v1.0
 */
public class HelloMavenTest {

    @Test
    public void testHelloMaven(){
        HelloMaven helloMaven = new HelloMaven();
        System.out.println(helloMaven.hello("Maven ^_^"));
    }

}
