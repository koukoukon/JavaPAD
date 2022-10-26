package me.hibiki.chapter02;

/**
 * @author koukoukon
 * @date 2022/9/21 15:53
 */
public class BitwiseOperators {
    public void and() {
        //0000 0011
        int a = 3;
        //0000 0101
        int b = 5;
        //0000 0001
        int c = a & b;
        System.out.println(c);
    }

    public void or() {
        int a = 3;
        int b = 5;
        int c = a | b;
        System.out.println(c);
    }

    public void xor() {
        int a = 3;
        int b = 5;
        int c = a ^ b;
        System.out.println(c);
    }

    public void negate() {
        int a = 3;
        int b = ~a;
        System.out.println(b);
    }

    public void rightShift() {
        int a = 3;
        int b = a >> 1;
        System.out.println(b);
    }

    public void leftShift() {
        int a = 3;
        int b = a << 1;
        System.out.println(b);
    }

    public void unsignedRightShift() {
        int a = 3;
        int b = a >>> 1;
        System.out.println(b);
    }

    public static void main(String[] args) {
        BitwiseOperators bitwiseOperators = new BitwiseOperators();
        bitwiseOperators.and();
        bitwiseOperators.or();
        bitwiseOperators.xor();
        bitwiseOperators.negate();
        bitwiseOperators.rightShift();
        bitwiseOperators.leftShift();
        bitwiseOperators.unsignedRightShift();
    }
}
