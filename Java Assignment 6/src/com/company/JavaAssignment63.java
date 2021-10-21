package com.company;
import com.company.helperClasses.HelperClass;

public class JavaAssignment63 {
    public static void main(String[] args){
        HelperClass helper = new HelperClass("This is statement is printed because helper object is created");
        HelperClass[] testingArray = new HelperClass[5];
        testingArray[0]=new HelperClass("0th index");
        testingArray[1]=new HelperClass("1th index");
        testingArray[2]=new HelperClass("2th index");
        testingArray[3]=new HelperClass("3th index");
        testingArray[4]=new HelperClass("4th index");

        for(int i=0;i<5;i++){
            System.out.println(testingArray[i]);
        }
    }
}
//3. Create a class with a constructor that takes a String argument.
//        During construction, print the argument.
//        Create an array of object references to this class, but don’t actually
//        create objects to assign into the array. When you run the program,
//        notice whether the initialization messages from the constructor calls are
//        printed.