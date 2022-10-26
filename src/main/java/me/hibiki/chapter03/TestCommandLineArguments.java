package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/10/10 12:24
 */
public class TestCommandLineArguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
    }
}
