package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 21:22
 */
public class ContinueTest {
    public static void main(String[] args) {
        for (int i =1;i<=10;i++){
            if (i%3==0){
                continue;
            }
            System.out.println("i="+i);
        }
    }
}
