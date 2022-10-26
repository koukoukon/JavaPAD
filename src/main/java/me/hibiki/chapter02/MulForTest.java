package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 20:34
 */
public class MulForTest {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
