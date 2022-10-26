package me.hibiki.chapter04;

/**
 * @author koukoukon
 * @date 2022/10/17 10:59
 */
public class TestConstructor {

}

class Employee {
    private String employeeName;
    private double employeeSalary;
    static double mini_salary = 600;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
        System.out.println("父类构造方法的调用");
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary + mini_salary;
    }

    @Override
    public String toString() {
        return "姓名：" + employeeName + "：工资：";
    }
}

class CommonEmployee extends Employee {
    private double bonus;

    public CommonEmployee(String employeeName, double bonus) {
        super(employeeName);
        this.bonus = bonus;
        System.out.println("子类构造方法的调用");
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getEmployeeSalary() {
        return bonus + mini_salary;
    }

    @Override
    public String toString() {
        String s;
        s = super.toString();
        return (s + getEmployeeSalary() + " ");
    }

    public static void main(String[] args) {
        Employee employee = new Employee("李平");
        employee.setEmployeeSalary(1200);
        System.out.println("员工的基本信息为：" + employee + employee.getEmployeeSalary());
        CommonEmployee commonEmployee = new CommonEmployee("李晓云", 500);
        System.out.println("员工的基本信息为：" + commonEmployee);
    }
}