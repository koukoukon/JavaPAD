package me.hibiki.experiment;

/**
 * @author koukoukon
 * @date 2022/10/12 16:25
 */
public class FindPrimeNumber {
    public static void main(String[] args) {
        //记录找到的素数个数
        int n = 0;
        //素数相加之和
        int sum = 0;
        int[] array = new int[10];
        //因为素数中正整数中偶数只有2是素数，所以从999找起，每次-2
        for (int i = 999; i >= 3; i -= 2) {
            //从2开始依次试除
            for (int j = 2; j < i; j++) {
                //首先i与j此时不可能相等,但若不相等还可以除尽则表示j是除1和它本身之外的因子,即不是素数.跳出不再循环.
                if (i % j == 0) {
                    break;
                }
                //j与i-1相等.因为判断条件j<i.如果i是一个素数,那么j==i-1.如果不是则不等.
                //如果是素数,存入数组,并将数组个数相加
                if (j == i - 1) {
                    array[n] = i;
                    n++;
                }
            }
            //已经有10个,跳出不再寻找
            if (n == 10) {
                break;
            }
        }
        //将数组中的10个元素相加
        for (int i = 0; i < 10; i++) {
            sum += array[i];
            System.out.println(array[i]);
        }
        //输出和
        System.out.println(sum);
    }
}
