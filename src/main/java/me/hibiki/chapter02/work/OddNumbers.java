package me.hibiki.chapter02.work;

import java.util.Scanner;

/**
 * @author koukoukon
 * @date 2022/9/22 11:14
 */
public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数，用,隔开");
        String str = scanner.nextLine();
        String[] numbers = str.split(",");
        int n1 = Integer.parseInt(numbers[0]);
        int n2 = Integer.parseInt(numbers[1]);
        if (n1 > n2) {
            int sum = 0;
            for (int i = n2+1; i < n1; i++) {
                if (i%2!=0){
                    sum+=i;
                }
            }
            System.out.println(sum);
        } else if (n1 < n2) {
            int sum = 0;
            for (int i = n1+1; i < n2; i++) {
                if (i%2!=0){
                    sum+=i;
                }
            }
            System.out.println(sum);
        } else {
            System.out.println("请输入一大一小两个整数");
        }

    }
}
