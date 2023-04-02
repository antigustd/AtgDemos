package com.atguigu.java1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName: TemplatesTest
 * Package: com.atguigu.java1
 * Description:
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 2022/10/22 - 11:23
 * @Version: v1.0
 */
public class TemplatesTest {

    private static String str7;
    private String string;

    public static final int NUM = 10;

    public static final int NUM1 = 10;

    public static final String INFO = "TemplatesTest";

    private static final double PI = 3.14;


    public static void main(String[] args) {
        //1. 非空判断
        String str = "hello";
        if(str == null){

        }
        if (str == null) {

        }

        if (str != null) {

        }

        if (str != null) {

        }

        if (str == null) {

        }

        if (str != null) {

        }

        //2. 遍历数组、集合
        int[] arr = new int[]{1,2,3,4};
        //一般的for:fori
        for (int i = 0; i < arr.length; i++) {

        }
        //增强for循环：for
        for (int i : arr) {

        }
        //倒序的遍历：forr
        for (int i = arr.length - 1; i >= 0; i--) {

        }

        testArr();

        //增强for循环：iter
        for (int i : arr) {

        }
        
        ArrayList list = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (Object o : list) {

        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        for (Object o : list) {
            
        }
        //fori
        for (int i = 0; i < list.size(); i++) {

        }

        //3. 输出语句
        System.out.println(123);
        System.out.println("hello");

        System.out.println("TemplatesTest.main");
        System.out.println("args = " + Arrays.deepToString(args));

        int num = 10;
        System.out.println("num = " + num);

        String str1 = "abc";

        System.out.println("str1 = " + str1);

        String str2 = "123";

        System.out.println("str2 = " + str2);

        System.out.println("hello");

        System.out.println(num);
        System.out.println("num = " + num);

        //4. 对象操作
        String str3 = new String();
        String str4 = new String();
        String str5 = new String();
        String str6 = new String();

        str7 = new String();

        Object obj = new String();
        String obj1 = (String) obj;

        String s = (String) obj;

        //5. 静态常量的声明
        //在成员变量的位置演示。
    }

    public void test1(int num,String str){
        System.out.println("TemplatesTest.test1");
        System.out.println("num = " + num);
        System.out.println("num = " + num + ", str = " + str);

        string = new String();
    }

    /*
    * 题目：提供一个数组：int[] arr = new int[]{213,34,3,54,5,34,244,53};
    *      遍历数组每一个元素，将数组每个位置的元素与第1个元素做除法，得到的结果作为该位置上的新值
    * */
    public static void testArr(){
        int[] arr = new int[]{23,34,3,54,5,34,244,53};

        //错误写法：
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] / arr[0];
//        }

        //正确写法：
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
