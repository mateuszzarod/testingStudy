package com.kodilla.patterns.OOP.AbstractClassSalary;

public abstract class SalaryPayout {
    private SalaryCalculator salaryCalculator;

    public SalaryPayout(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("processing for" + this.salaryCalculator.calculateSalary() + "PLN");
        System.out.println("processing" + this.salaryCalculator);

        this.payout();
        System.out.println("completed!");
    }

}
