package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/9/28 15:43
 */
public class SimpleValue {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("方法调用前x="+x);
        change(x);
        System.out.println("change方法调用后x="+x);
    }
    public static void change(int x){
        x = 4;
    }
}
