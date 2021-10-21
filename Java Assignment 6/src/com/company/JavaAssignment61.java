package com.company;

import com.company.helperClasses.Checker;


public class JavaAssignment61 {

    public static void main(String[] args) {

        System.out.println("The first 100 vampire numbers are:");

        int countOfVampireNumbers=0;
        for(int i=1000;countOfVampireNumbers<=100;i++){
            if(Checker.check(i)){
                System.out.println(i);
                countOfVampireNumbers++;
            }
        }
    }

}
//Operators and More:
//        1. A vampire number v is a number with an even number of digits n,
//        that can be factored into two numbers x and y each with n/2 digits
//        and not both with trailing zeroes, where v contains precisely all
//        the digits from x and from y, in any order. Write a java program to
//        print first 100 vampire numbers.
