package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/10/10 12:29
 */
public class A {
    String name;

    public A(String name) {
        this.name = name;
    }
    public void function1(){
        System.out.println("function1 of "+name+" is calling");
    }
    public void function2(){
        A a2 = new A("a2");
        this.function1();
        a2.function1();
    }
}
class TestA{
    public static void main(String[] args) {
        A a1 = new A("a1");
        a1.function2();
    }
}
