package me.hibiki.experiment;

/**
 * @author koukoukon
 * @date 2022/10/12 17:20
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        int[] number = new int[3];
        System.out.println("水仙花数有：");
        for (int i = 999; i > 100; i--) {
            int sum = 0;
            //百位
            number[0] = i / 100 % 10;
            //十位
            number[1] = i / 10 % 10;
            //个位
            number[2] = i % 10;
            for (int j = 0; j < 3; j++) {
                sum += Math.pow(number[j], 3);
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}