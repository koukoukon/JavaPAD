package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/10/10 12:54
 */
public class ConstructorOverloaded {
    public static void main(String[] args) {
        Employee3 e1 = new Employee3();
        System.out.println(e1);
        Employee3 e2 = new Employee3("李萍");
        System.out.println(e2);
        Employee3 e3 = new Employee3("王嘉怡", 2400);
        System.out.println(e3);
    }
}

class Employee3 {
    private double employeeSalary = 1800;
    private String employeeName = "姓名未知";
    private int employeeNo;

    public Employee3() {
    }

    public Employee3(String employeeName) {
        this.employeeName = employeeName;
    }

    public Employee3(String employeeName, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;

    }

    @Override
    public String toString() {
        return "Employee3{" +
                "employeeSalary=" + employeeSalary +
                ", employeeName='" + employeeName + '\'' +
                ", employeeNo=" + employeeNo +
                '}';
    }

}