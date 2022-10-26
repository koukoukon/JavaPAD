package me.hibiki.chapter02;

import java.util.Scanner;

/**
 * @author koukoukon
 * @date 2022/9/21 20:10
 */
public class IfTest {
    public static void main(String[] args) {
        System.out.println("请输入你的年龄：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("你已经是成年人了！");
        }
    }
}
