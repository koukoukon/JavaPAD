package me.hibiki.chapter02;

import java.util.Scanner;

/**
 * @author koukoukon
 * @date 2022/9/21 20:17
 */
public class IfElseNestTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入x1:");
        int x1 = scanner.nextInt();
        System.out.println("请输入x2:");
        int x2 = scanner.nextInt();
        if (x1 > x2) {
            System.out.println("结果是：" + "x1>x2");
        } else {
            if (x1 < x2) {
                System.out.println("结果是：" + "x1<x2");
            } else {
                System.out.println("结果是：" + "x1=x2");
            }
        }
    }
}
