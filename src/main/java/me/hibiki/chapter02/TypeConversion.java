package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 18:08
 */
public class TypeConversion {
    public void implicitTypeConversion() {
        int a = 3;
        System.out.println(a);
        double b = a;
        System.out.println(b);
    }

    public void explicitTypeConversion() {
        int a = 3;
        System.out.println(a);
        double b = 5.0;
        System.out.println(b);
        a = (int) b;
        System.out.println(a);
    }

    public static void main(String[] args) {
        TypeConversion typeConversion = new TypeConversion();
        typeConversion.implicitTypeConversion();
        System.out.println();
        typeConversion.explicitTypeConversion();
    }
}
