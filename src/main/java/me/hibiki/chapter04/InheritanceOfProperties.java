package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 10:23
 */
public class InheritanceOfProperties {
}

class Person {
    public String name;
    public int age;

    public void showInfo() {
        System.out.println("尊敬的" + name + "，您的年龄为：" + age);
    }
}

class Student extends Person {
    public String school;
    public int engScore;
    public int javaScore;

    public void setInfo() {
        name = "陈冠一";
        age = 20;
        school = "郑州轻工业大学";
    }
}
