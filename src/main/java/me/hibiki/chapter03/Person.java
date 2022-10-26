package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/10/10 12:40
 */
public class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
}
