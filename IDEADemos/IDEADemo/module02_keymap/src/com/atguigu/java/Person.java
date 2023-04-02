package com.atguigu.java;

import java.util.Objects;

/**
 * ClassName: Person
 * Package: com.atguigu.java
 * Description:
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 2022/10/22 - 15:35
 * @Version: v1.0
 */
public class Person {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println("Person:eat()");
    }

    public void sleep(){
        System.out.println("Person:sleep()");
    }
}
