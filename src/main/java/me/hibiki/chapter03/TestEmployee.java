package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/10/9 14:34
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee2 employee1 = new Employee2();
        employee1.setEmployeeName("王一");
        employee1.setEmployeeNo(100001);
        employee1.setEmployeeSalary(2100);
        System.out.println(employee1);
        Employee2 employee2 = new Employee2();
        System.out.println(employee2);;
        Employee2 employee3 = new Employee2();
        employee3.setEmployeeName("王华");
        System.out.println(employee3);
    }
}

class Employee2{
    String employeeName;
    int employeeNo;
    double employeeSalary;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeNo=" + employeeNo +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}