package com.company;

public class Data {
    int intvar;
    char charvar;
//    The intvar and charvar are instance variables so their values would be initialised
//    during the creation of an object.
    void printvar(){
        System.out.println("The int variable is "+intvar+" ,the char variable is "+charvar);
    }

    void printLocalVar(){
        int localint;
        char localchar;
//        System.out.println("The int local variable is "+localint+" ,the local char variable is "+charvar);
//      The localint and localchar are not instance variables, so they cannot be printed
//        without initialising their values.
    }
}
