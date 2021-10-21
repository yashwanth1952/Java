package com.company.helperClasses;

public class TwoConstructors{
    public TwoConstructors(){
//        this(10);
        System.out.println("This constructor has no arguments");
    }
    public TwoConstructors(int n){
        this();
        System.out.println("This constructor has argument "+n);
    }
}