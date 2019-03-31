package com.kodilla.patterns.OOP.AbstractClassSalary;

public class SalaryPayoutProcessor extends SalaryPayout {
    SalaryCalculator salaryCalculator;

    public SalaryPayoutProcessor(SalaryCalculator salaryCalculator) {
        super(salaryCalculator);
    }

    protected void payout() {
        System.out.println("sending money to employee");
    }
}
