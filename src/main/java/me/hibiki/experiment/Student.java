package me.hibiki.experiment;

/**
 * @author koukoukon
 * @date 2022/10/21 16:42
 */
public class Student {
    private int sNo;
    private String sName;
    private String sSex;
    private int sAge;
    private int sJava;

    public Student(int sNo, String sName, String sSex, int sAge, int sJava) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public int getNo() {
        return sNo;
    }

    public String getName() {
        return sName;
    }

    public String getSex() {
        return sSex;
    }

    public int getAge() {
        return sAge;
    }

    public double getJava() {
        return sJava;
    }

    public double getAverageJava(Student[] students) {
        double sum = 0;
        for (Student student : students) {
            sum += student.getJava();
        }
        return sum / students.length;
    }

    public double getMaximumJava(Student[] students) {
        double maximumJava = -1;
        for (Student student : students) {
            if (student.getJava() > maximumJava) {
                maximumJava = student.getJava();
            }
        }
        return maximumJava;
    }

    public double getMinimumJava(Student[] students) {
        double minimum = 100;
        for (Student student : students) {
            if (student.getJava() < minimum) {
                minimum = student.getJava();
            }
        }
        return minimum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", sName='" + sName + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sAge=" + sAge +
                ", sJava=" + sJava +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student(1, "小高", "男", 22, 100);
        Student student2 = new Student(2, "小泳", "男", 22, 99);
        Student student3 = new Student(2, "小胖", "男", 20, 98);
        Student student4 = new Student(2, "小洋", "男", 21, 97);
        Student student5 = new Student(1, "小颖", "女", 20, 96);
        Student[] students = new Student[5];
        students[0] = student;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        for (Student tempStudent : students) {
            System.out.println(tempStudent);
        }
        System.out.println("这五个学生Java语言成绩的平均值为：" + student.getAverageJava(students));
        System.out.println("这五个学生Java语言成绩的最大值为：" + student.getMaximumJava(students));
        System.out.println("这五个学生Java语言成绩的最小值为：" + student.getMinimumJava(students));
    }

}
