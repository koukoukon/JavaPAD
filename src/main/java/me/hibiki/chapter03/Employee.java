package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/9/28 15:07
 */
public class Employee {
    private String employeeName;

    private Employee() {
    }

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
    }
}