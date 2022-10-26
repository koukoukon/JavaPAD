package me.hibiki.chapter02.work;

import java.util.Scanner;

/**
 * @author koukoukon
 * @date 2022/9/22 10:25
 */
public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份和月份：");
        String str = scanner.nextLine();
        String[] yearAndMonth = str.split(",");
            int year = Integer.parseInt(yearAndMonth[0]);
            int month = Integer.parseInt(yearAndMonth[1]);
            if (year % 4 == 0 && year % 100 != 0) {
                switch (month) {
                    case 2:
                        System.out.println(year + "年" + month + "月" + "有29天.");
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println(year + "年" + month + "月" + "有31天.");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(year + "年" + month + "月" + "有30天.");
                        break;
                    default:
                        System.out.println("输入有误,无" + month + "月");
                }
            } else if (year % 400 == 0) {
                switch (month) {
                    case 2:
                        System.out.println(year + "年" + month + "月" + "有29天.");
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println(year + "年" + month + "月" + "有31天.");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(year + "年" + month + "月" + "有30天.");
                        break;
                    default:
                        System.out.println("输入有误,无" + month + "月");
                }
            } else {
                switch (month) {
                    case 2:
                        System.out.println(year + "年" + month + "月" + "有28天.");
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println(year + "年" + month + "月" + "有31天.");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(year + "年" + month + "月" + "有30天.");
                        break;
                    default:
                        System.out.println("输入有误,无" + month + "月");
                }
            }
    }
}
