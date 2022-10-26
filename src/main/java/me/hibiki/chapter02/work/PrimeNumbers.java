package me.hibiki.chapter02.work;

import java.util.Scanner;

/**
 * @author koukoukon
 * @date 2022/9/22 12:08
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数,用\",\"隔开");
        String str = scanner.nextLine();
        String[] numbers = str.split(",");
        int n1 = Integer.parseInt(numbers[0]);
        int n2 = Integer.parseInt(numbers[1]);
        if (n1>n2){
            for (int i =n2;i<n1;i++){
                boolean flag = false;
                System.out.println("当前是"+i);
                if (i/1==i&&i/i==1){
                        for (int j=2;j<=i-1;j++){
                            System.out.println((double)i/j);
                            if (i/j== 3.0){
                                flag=true;
                                System.out.println(flag);
                            }else if (i/j!=3.0){
                                flag = false;
                                System.out.println(flag);
                            }

                        }
                }
            }
        }
    }
}
