package com.company;

import com.company.helperClasses.HelperClass;

public class JavaAssignment64 {
    public static void main(String[] args){
        HelperClass helperClass=new HelperClass("This statement is printed due to helperClass Object");
        HelperClass Object1=new HelperClass("First Object");
        HelperClass Object2=new HelperClass("Second Object");
        HelperClass Object3=new HelperClass("Third Object");

        HelperClass testingArray[]=new HelperClass[3];

        testingArray[0]=Object1;
        testingArray[1]=Object2;
        testingArray[2]=Object3;

        for(int i=0;i<3;i++) {
            System.out.println(testingArray[i]);
        }
    }
}
//4. Complete the previous exercise by creating objects to attach to the
//        array of references.