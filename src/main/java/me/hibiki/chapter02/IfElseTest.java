package me.hibiki.chapter02;

import java.util.Scanner;

/**
 * @author koukoukon
 * @date 2022/9/21 20:13
 */
public class IfElseTest {
    public static void main(String[] args) {
        System.out.println("请输入你的年龄：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age>=18){
            System.out.println("成年人");
        }else {
            System.out.println("未成年人");
        }
    }
}
