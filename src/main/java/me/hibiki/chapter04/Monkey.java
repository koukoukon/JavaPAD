package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 11:26
 */
public class Monkey extends Mammal {
    void computer(int aa, int bb) {
        int cc = aa * bb;
        System.out.println(cc);
    }

    @Override
    void crySpeak(String s) {
        System.out.println("**" + s + "**");
    }

    public static void main(String[] args) {
        Mammal mammal = new Monkey();
        mammal.crySpeak("I love this game");
        Monkey monkey = (Monkey) mammal;
        monkey.computer(10, 10);
    }
}

class Mammal {
    private int n = 50;

    void crySpeak(String s) {
        System.out.println(s);
    }
}
