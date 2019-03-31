package com.kodilla.patterns.OOP;

public interface ATM {
    void cashPayIn(int cash);

    void cashPayOut(int cash);

    default void connect() {
        System.out.println("connection ok ");
    }

    static String endOfConnection() {
        return "end of connection";
    }
}
