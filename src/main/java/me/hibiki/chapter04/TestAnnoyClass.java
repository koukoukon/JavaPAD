package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/26 15:15
 */
public class TestAnnoyClass {
    public void test(Bird bird) {
        System.out.println(bird.getName() + "能够飞" + bird.fly() + "米");
    }

    public static void main(String[] args) {
        TestAnnoyClass testAnnoyClass = new TestAnnoyClass();
        testAnnoyClass.test(new Bird() {
            @Override
            public int fly() {
                return 1000;
            }

            @Override
            public String getName() {
                return "大雁";
            }
        });
    }
}

abstract class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();
}
