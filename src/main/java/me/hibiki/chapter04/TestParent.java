package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 11:19
 */
public class TestParent {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();
        parent.function();
        child.function();
    }
}

class Parent {
    public void function() {
        System.out.println("I am in Parent!");
    }
}

class Child extends Parent {
    public void function() {
        System.out.println("I am in Child!");
    }
}

