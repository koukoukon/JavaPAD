package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 10:47
 */
public class SubStudent3 extends Person3 {
    private String school;
    private int engScore;
    private int javaScore;

    @Override
    public void showInfo() {
        System.out.println(school + "的" + name + "同学" + "年龄为：" + age + "\n英语成绩是：" + engScore + "，你的Java成绩是：" + javaScore);
    }

    public void setScore(String s, int e, int j) {
        school = s;
        engScore = e;
        javaScore = j;
    }

    public static void main(String[] args) {
        SubStudent3 subStudent3 = new SubStudent3();
        subStudent3.initInfo("王烁", 22);
        subStudent3.setScore("郑州轻工业大学", 79, 92);
        subStudent3.showInfo();
    }
}

class Person3 {
    protected String name;
    protected int age;

    public void initInfo(String n, int a) {
        name = n;
        age = a;
    }

    public void showInfo() {
        System.out.println("尊敬的" + name + "，您的年龄为：" + age);

    }

}
