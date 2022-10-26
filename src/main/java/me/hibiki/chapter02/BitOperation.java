package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 18:00
 */
public class BitOperation {
    public static void main(String[] args) {
        int i = 3;
        int j = 5;
        System.out.println("i&j的值为：" + (i & j));
        System.out.println("i|j的值为：" + (i | j));
        System.out.println("i^j的值为：" + (i ^ j));
        System.out.println("~i的值为：" + (~i));
        System.out.println("i>>1的值为：" + (i >> 1));
        System.out.println("i<<1的值为：" + (i << 1));
    }
}
