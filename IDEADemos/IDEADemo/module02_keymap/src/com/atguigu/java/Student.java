package com.atguigu.java;

/**
 * ClassName: Student
 * Package: com.atguigu.java
 * Description:
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 2022/10/22 - 15:47
 * @Version: v1.0
 */
public class Student extends Person implements Comparable,Runnable{

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
