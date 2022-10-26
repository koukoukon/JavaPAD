package me.hibiki.chapter02.work;

import java.util.Scanner;

/**
 * @author koukoukon
 * @date 2022/9/22 10:18
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "是闰年");
        } else if (year % 400 == 0) {
            System.out.println(year + "是世纪闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }
}
