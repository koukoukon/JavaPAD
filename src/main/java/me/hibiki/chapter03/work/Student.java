package me.hibiki.chapter03.work;

import java.util.Arrays;
import java.util.List;

/**
 * @author 522207300405 高弘昆
 * @date 2022/9/21 19:10
 */
public class Student {
    private String studentName;
    private Integer studentAge;
    private List<String> studentCoursesAttended;
    private String[] studentHobbies;

    public Student() {
    }

    public Student(String studentName, Integer studentAge, List<String> studentCoursesAttended, String[] studentHobbies) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentCoursesAttended = studentCoursesAttended;
        this.studentHobbies = studentHobbies;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public List<String> getStudentCoursesAttended() {
        return studentCoursesAttended;
    }

    public void setStudentCoursesAttended(List<String> studentCoursesAttended) {
        this.studentCoursesAttended = studentCoursesAttended;
    }

    public String[] getStudentHobbies() {
        return studentHobbies;
    }

    public void setStudentHobbies(String[] studentHobbies) {
        this.studentHobbies = studentHobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentCoursesAttended=" + studentCoursesAttended +
                ", studentHobbies=" + Arrays.toString(studentHobbies) +
                '}';
    }
}

