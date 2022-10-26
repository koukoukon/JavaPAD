package me.hibiki.experiment;

import java.util.Scanner;

/**
 * @author koukoukon
 * @date 2022/10/12 16:19
 */
public class ForcedTypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个浮点数：");
        double number = scanner.nextDouble();
        //将用户输入的浮点数转为整型后输出
        System.out.println((int) number);
    }
}
