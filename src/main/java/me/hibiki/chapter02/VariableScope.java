package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/20 17:23
 */
public class VariableScope {

}

class ClassVar {
    int x = 45;
    int y;
}

class LocalVar {
    public static void main(String[] args) {
        int x = 45;
        if (x > 5) {
            int y = 0;
            System.out.println(y);
        }
        System.out.println(x);
    }
}
class FunctionParaVar{
    public static int getSum(int x){
        x = x+1;
        return x;
    }

    public static void main(String[] args) {
        int sum = FunctionParaVar.getSum(2);
        System.out.println(sum);
    }
}
