package com.atguigu.plugins;

/**
 * ClassName: Customer
 * Package: com.atguigu.plugins
 * Description:
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 2022/10/24 - 10:34
 * @Version: v1.0
 */
public class Customer {

    private String name;
    private int age;
    private String gender;
    private Hometown hometown;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Hometown getHometown() {
        return hometown;
    }

    public void setHometown(Hometown hometown) {
        this.hometown = hometown;
    }

    public static class Hometown {
        private String province;
        private String city;
        private String county;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCounty() {
            return county;
        }

        public void setCounty(String county) {
            this.county = county;
        }
    }
}
