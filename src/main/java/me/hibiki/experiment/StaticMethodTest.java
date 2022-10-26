package me.hibiki.experiment;

/**
 * @author koukoukon
 * @date 2022/10/21 17:45
 */
public class StaticMethodTest {
    public static int a = 114;
    public static int b = 514;

    public static int sum() {
        return a + b;
    }

    public int average() {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        System.out.println("调用静态方法sum()进行测试的结果：" + StaticMethodTest.sum());

        System.out.println("调用实例average()进行测试的结果：" + new StaticMethodTest().average());
    }
}
