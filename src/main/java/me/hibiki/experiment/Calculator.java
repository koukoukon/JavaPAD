package me.hibiki.experiment;

import java.util.Scanner;

/**
 * @author koukoukon
 * @date 2022/10/12 15:17
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个浮点数：");
        double n = scanner.nextDouble();
        System.out.println("请输入第二个浮点数：");
        double n2 = scanner.nextDouble();
        System.out.println(n + "与" + n2 + "的和：" + (n + n2));
        System.out.println(n + "与" + n2 + "的差：" + (n - n2));
        System.out.println(n + "与" + n2 + "的积：" + (n * n2));
        scanner.close();
    }
}
