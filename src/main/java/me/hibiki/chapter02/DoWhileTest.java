package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 20:27
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int result = 1;
        int i = 1;
        do {
            result = result * i;
            i = i + 1;
        } while (i <= 5);
        System.out.println("result=" + result);
    }
}
