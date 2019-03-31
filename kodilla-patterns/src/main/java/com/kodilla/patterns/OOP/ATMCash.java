package com.kodilla.patterns.OOP;

public class ATMCash implements ATM {

    private int aviableCash;
    private int cash;

    public ATMCash(int aviableCash, int cash){
        this.aviableCash=aviableCash;
        this.aviableCash=cash;
    }

    @Override
    public void cashPayIn(int cash) {
        this.cash = cash;
        this.aviableCash = aviableCash + cash;
        System.out.println("payed in" + cash);
    }

    @Override
    public void cashPayOut(int cash) {
        if (cash > 0 && cash <= this.aviableCash){
            aviableCash = aviableCash - cash;
        } else System.out.println("no money!");
    }
}
