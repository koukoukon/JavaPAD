package me.hibiki.chapter03.work;

import java.util.Arrays;
import java.util.List;

/**
 * 教师类
 * @author 522207300405 高弘昆
 * @date 2022/9/21 19:13
 */
public class Teacher {
    //教师姓名
    private String teacherName;
    //教师专业方向
    private String[] teacherProfessionalDirection;
    //教师教授的课程
    private List<String> teacherCoursesTaught;
    //教龄
    private Integer teacherTeachingAge;

    public Teacher() {
    }

    public Teacher(String teacherName, String[] teacherProfessionalDirection, List<String> teacherCoursesTaught, Integer teacherTeachingAge) {
        this.teacherName = teacherName;
        this.teacherProfessionalDirection = teacherProfessionalDirection;
        this.teacherCoursesTaught = teacherCoursesTaught;
        this.teacherTeachingAge = teacherTeachingAge;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String[] getTeacherProfessionalDirection() {
        return teacherProfessionalDirection;
    }

    public void setTeacherProfessionalDirection(String[] teacherProfessionalDirection) {
        this.teacherProfessionalDirection = teacherProfessionalDirection;
    }

    public List<String> getTeacherCoursesTaught() {
        return teacherCoursesTaught;
    }

    public void setTeacherCoursesTaught(List<String> teacherCoursesTaught) {
        this.teacherCoursesTaught = teacherCoursesTaught;
    }

    public Integer getTeacherTeachingAge() {
        return teacherTeachingAge;
    }

    public void setTeacherTeachingAge(Integer teacherTeachingAge) {
        this.teacherTeachingAge = teacherTeachingAge;
    }

    /**
     * 显示教师个人信息
     * @return 教师个人信息
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherProfessionalDirection=" + Arrays.toString(teacherProfessionalDirection) +
                ", teacherCoursesTaught=" + teacherCoursesTaught +
                ", teacherTeachingAge=" + teacherTeachingAge +
                '}';
    }
}
