package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 20:25
 */
public class WhileTest {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println("sum=" + sum);
    }
}
