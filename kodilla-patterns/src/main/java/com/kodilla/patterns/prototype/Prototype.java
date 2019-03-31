package com.kodilla.patterns.prototype;


//interfejs oznaczający do oznaczenia klas, które nadają się do klonowania
public class Prototype<T> implements Cloneable {
    @Override
    public T clone() throws CloneNotSupportedException{
        return (T)super.clone();
    }
}
