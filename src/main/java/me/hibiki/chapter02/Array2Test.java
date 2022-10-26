package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 22:23
 */
public class Array2Test {
    public static void main(String[] args) {
        int ss[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i =0;i<ss.length;i++){
            for (int j=0;j<ss[i].length;j++){
                System.out.print("ss["+i+"]["+j+"]="+ss[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
