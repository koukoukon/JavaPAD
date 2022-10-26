package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 21:45
 */
public class Array1Test {
    public static void main(String[] args) {
        double[] score = {76.5, 88.0,92.5,65};
        double sum =0;
        for (int i =0;i<score.length;i++){
            sum = sum+score[i];
        }
        System.out.println("总成绩为："+sum);
        System.out.println("平均成绩为："+sum/score.length);

    }
}
