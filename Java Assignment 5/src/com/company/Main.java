package com.company;

public class Main {

    public static void main(String[] args) {

        Data data=new Data();
        data.printvar();
        data.printLocalVar();

        Singleton singleton=new Singleton();
        singleton.printString();
        Singleton temp=singleton.returnObject("test String");
        temp.printString();
    }
}
//    Create a class in a package yourname.assignment.data containing an int and
//    a char member variables that are not initialized, add a method to print these
//    variables. Add another method in the same class with two local variables and
//    print their values without initializing them.
//
//        Create another class in package yourname.assignment.singleton containing a
//        non static String member variable. Add a static method that takes String as
//        parameter and initialize the member variable and then return object of that
//        class. Add a non static method to print the String.
//
//        Create main class in package yourname.assignment.main, create object of
//        first class and call both the methods to print the values. Create object
//        of second class using static method and then call the other method to print
//        the String.
//
//        One or more tasks mentioned above are not possible in JAVA, comment that
//        part of the code with block comments and add the explanation for the same.
//
//        Provide the github url of your assignment.