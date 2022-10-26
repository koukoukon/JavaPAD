package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 20:37
 */
public class BreakTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum+i;
            if (sum>500){
                break;
            }
        }
        System.out.println("sum="+sum);
    }
}
