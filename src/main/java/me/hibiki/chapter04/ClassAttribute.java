package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 10:27
 */
public class ClassAttribute {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setInfo();
        worker.showSalary();
    }
}

class Employee1 {
    public String name;
    public int age;
    public double salary = 1200;

    public void showSalary() {
        System.out.println("尊敬的" + name + "，您的薪水为：" + salary);
    }
}

class Worker extends Employee1 {
    public double salary;

    public void setInfo() {
        name = "可人";
        age = 20;
        System.out.println("调用父类的数据的输出结果：" + super.name + "，您的薪水为：" + super.salary);
        salary = 800;
    }

    @Override
    public void showSalary() {
        System.out.println("子类和父类同名的数据输出结果：" + name + "，您的薪水为；" + salary);
    }
}