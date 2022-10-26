package me.hibiki.chapter03.work;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 522207300405 高弘昆
 * @date 2022/9/21 19:16
 */
public class TestTeacher {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setStudentName("高弘昆");
//        student.setStudentAge(22);
//        List<String> coursesAttended = new ArrayList<>();
//        coursesAttended.add("Java程序设计B");
//        coursesAttended.add("面向对象网络程序设计");
//        coursesAttended.add("数据库系统及其应用");
//        student.setStudentCoursesAttended(coursesAttended);
//        String[] hobbies = {"吃饭", "睡觉", "打豆豆"};
//        student.setStudentHobbies(hobbies);

        Teacher teacher = new Teacher();
        teacher.setTeacherName("霍林林");
        String[] professionalDirection = {"空间推理", "知识表示"};
        teacher.setTeacherProfessionalDirection(professionalDirection);

        List<String> coursesTaught = new ArrayList<>();
        coursesTaught.add("Java程序设计B");
        coursesTaught.add("等课程");
        teacher.setTeacherCoursesTaught(coursesTaught);
        teacher.setTeacherTeachingAge(10);
//        System.out.println(student);
        System.out.println(teacher.toString());
    }
}
