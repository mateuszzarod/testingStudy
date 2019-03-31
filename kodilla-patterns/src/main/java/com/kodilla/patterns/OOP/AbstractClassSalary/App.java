package com.kodilla.patterns.OOP.AbstractClassSalary;

public class App {
    public static void main(String[] args) {
        FixedSalary fixedSalaryEmp = new FixedSalary(8.0, 10);
        SalaryPayoutProcessor salary = new SalaryPayoutProcessor(fixedSalaryEmp);
        salary.processPayout();
    }
}
