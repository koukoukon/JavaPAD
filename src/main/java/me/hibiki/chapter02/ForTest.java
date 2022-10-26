package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 20:30
 */
public class ForTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 100;i++){
            if (i%3==0){
                sum = sum+i;
            }
        }
        System.out.println("sum="+sum);
    }
}
