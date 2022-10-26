package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/10/9 14:28
 */
public class ReferenceValue {
    int x;

    public static void main(String[] args) {
        ReferenceValue referenceValue = new ReferenceValue();
        referenceValue.x=5;
        System.out.println("change方法调用前的x="+referenceValue.x);
        change(referenceValue);
        System.out.println("change方法调用后的x="+referenceValue.x);
    }
    public static void change(ReferenceValue referenceValue){
        referenceValue.x = 4;
    }
}
