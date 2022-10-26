package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 10:37
 */
public class SubStudent2 extends Person2 {
    private String school;
    private int engScore;
    private int javaScore;

    public void setScores(String s, int e, int j) {
        school = s;
        engScore = e;
        javaScore = j;
    }

    public static void main(String[] args) {
        SubStudent2 subStudent = new SubStudent2();
        subStudent.initInfo("王烁", 22);
        subStudent.showInfo();
        subStudent.setScores("情话（清华）大学", 79, 92);
    }

}

class Person2 {
    private String name;
    private int age;

    public void initInfo(String n, int a) {
        name = n;
        age = a;
    }

    public void showInfo() {
        System.out.println("尊敬的" + name + "，您的年龄为：" + age);
    }
}
