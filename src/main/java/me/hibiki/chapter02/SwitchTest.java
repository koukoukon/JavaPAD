package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 20:21
 */
public class SwitchTest {
    public static void main(String[] args) {
        int x = 6;
        int y = 9;
        char op = '+';
        switch (op) {
            case '+':
                System.out.println("x+y=" + (x + y));
                break;
            case '-':
                System.out.println("x-y=" + (x - y));
                break;
            case '*':
                System.out.println("x*y=" + (x * y));
                break;
            default:
                System.out.println("输入的运算符不合适！");
        }
    }
}
