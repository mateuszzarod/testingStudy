package com.kodilla.patterns.OOP.AbstractClassSalary;

public class FixedSalary implements SalaryCalculator {
    private double hours;
    private double hourlyPay;

    public FixedSalary(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary() {
        return this.hours * this.hourlyPay;
    }

    public double getHours(){
        return this.hours;
    }

    public double getHourlyPay(){
        return this.hourlyPay;
    }

}
