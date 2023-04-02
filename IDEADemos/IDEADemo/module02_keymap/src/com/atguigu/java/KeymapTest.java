package com.atguigu.java;


import java.util.Calendar;
import java.util.HashMap;

/**
 * ClassName: KeyMapTest
 * Package: com.atguigu.java
 * Description:
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 2022/10/22 - 15:29
 * @Version: v1.0
 */
public class KeymapTest {

    static final int NUM = 10;

    public static void main(String[] args) {
        System.out.println("hello");

        Class<?> clazz = null;
        try {
            clazz = Class.forName("java.lang.String");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            Class.forName("java.lang.Integer");

            int capacity = 16;
            HashMap hashMap = new HashMap(capacity);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        if (true) {
            String str1 = "info";
        } else {
        }
//        String str1234 = new String();
//        String str123 = new String();
//        System.out.println(str123);
//        str123 += "world";

        method2();
        method1();

        System.out.println(NUM);

        System.out.println(clazz);

    }

    private static void method2() {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();

        String str3 = new String("hello");
    }

    public static void method1() {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }

    public void method3() {
        method4();
        System.out.println("hello");
    }

    private void method4() {
        System.out.println("hello");
        System.out.println("hello");
    }
}
