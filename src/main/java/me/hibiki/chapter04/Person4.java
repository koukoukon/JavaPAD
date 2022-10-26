package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 11:17
 */
public class Person4 {
    private String name;
    private int age;

    public void initInfo(String n, int a) {
        name = n;
        age = a;
    }

    public void initInfo(String n) {
        name = n;
    }

    public void showInfo() {
        System.out.println("尊敬的" + name + "，您的年龄为；" + age);
    }
}
