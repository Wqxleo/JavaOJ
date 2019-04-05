package com.wqxiu;

/**
 * Created by wangquanxiu at 2018/9/19 21:45
 */
class Person {
    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void print(){
        System.out.print("name:"+name+"; "+"sex:"+sex+"; "+"age:"+age);
    }
}
