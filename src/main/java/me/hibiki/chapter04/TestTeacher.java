package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 10:13
 */
public class TestTeacher {
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher("李伟", "郑州轻工业大学");
        javaTeacher.giveLesson();
        javaTeacher.introduction();
        System.out.println();
        DotNetTeacher dotNetTeacher = new DotNetTeacher("王珂", "郑州(轻)工业大学");
        dotNetTeacher.giveLesson();
        dotNetTeacher.introduction();
    }
}

class Teacher {
    private String name;
    private String school;

    public Teacher(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public void giveLesson() {
        System.out.println("知识点讲解");
        System.out.println("总结提问");
    }

    public void introduction() {
        System.out.println("大家好！我是" + school + "的" + name + "。");
    }
}

class JavaTeacher extends Teacher {
    public JavaTeacher(String name, String school) {
        super(name, school);
    }

    @Override
    public void giveLesson() {
        System.out.println("启动IDEA");
        super.giveLesson();
    }

}

class DotNetTeacher extends Teacher {
    public DotNetTeacher(String name, String school) {
        super(name, school);
    }

    @Override
    public void giveLesson() {
        System.out.println("启动Visual studio 2022");
        super.giveLesson();
    }
}
