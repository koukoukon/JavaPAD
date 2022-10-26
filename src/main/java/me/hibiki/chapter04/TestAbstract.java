package me.hibiki.chapter04;

import java.text.DecimalFormat;

/**
 * @author koukoukon
 * @date 2022/10/26 14:56
 */
public class TestAbstract {
    public static void main(String[] args) {
        Employee2 employee2Ref;
        String output = "";
        Boss boss = new Boss("李晓华", 800.00);
        CommissionWorker commissionWorker = new CommissionWorker("张雪", 500.0, 3.0, 150);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        employee2Ref = boss;
        output += employee2Ref + "工资￥" + decimalFormat.format(employee2Ref.getSalary()) + "\n" + boss + "工资￥" + decimalFormat.format(boss.getSalary()) + "\n";
        employee2Ref=commissionWorker;
        output += employee2Ref + "工资￥" + decimalFormat.format(employee2Ref.getSalary()) + "\n" + commissionWorker + "工资￥" + decimalFormat.format(commissionWorker.getSalary()) + "\n";
        System.out.println(output);
    }
}

abstract class Employee2 {
    private String name;
    private double miniSalary = 600;

    public Employee2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract double getSalary();

}

final class Boss extends Employee2 {
    private double weeklySalary;

    public Boss(String name, double weeklySalary) {
        super(name);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = (weeklySalary > 0 ? weeklySalary : 0);
    }

    @Override
    public double getSalary() {
        return this.weeklySalary;
    }

    @Override
    public String toString() {
        return "经理：" + super.toString();
    }
}

final class CommissionWorker extends Employee2 {
    private double salary;
    private double commission;
    private int quantity;

    public CommissionWorker(String name, double salary, double commission, int quantity) {
        super(name);
        setSalary(salary);
        setCommission(commission);
        setQuantity(quantity);
    }

    public void setSalary(double salary) {
        this.salary = (salary > 0 ? salary : 0);
    }

    public void setCommission(double commission) {
        this.commission = (commission > 0 ? commission : 0);
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0 ? quantity : 0);
    }

    @Override
    public double getSalary() {
        return salary + commission * quantity;
    }

    @Override
    public String toString() {
        return "普通员工：" + super.toString();
    }
}