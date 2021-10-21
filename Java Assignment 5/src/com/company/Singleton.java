package com.company;

public class Singleton {
    static String stringvar;
    static Singleton returnObject(String s){
        Singleton object=new Singleton();
        object.stringvar=s;
        return object;
    }
    void printString(){
        System.out.println("The variable is "+stringvar);
    }
}
