package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 15:21
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        System.out.println("i后缀递增的值=" + (i++));
        System.out.println("j前缀递增的值=" + (++j));
        System.out.println("最终i的值=" + i);
        System.out.println("最终j的值=" + j);
    }

}
