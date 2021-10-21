package com.company;

import com.company.helperClasses.Bicycle;
import com.company.helperClasses.Cycle;
import com.company.helperClasses.Tricycle;
import com.company.helperClasses.Unicycle;

public class JavaAssignment72 {
    public static void main(String[] args){

        Cycle cycleArray[]=new Cycle[3];
//        upcasting
//        cycleArray[0]=(Cycle) new Unicycle();
//        cycleArray[0].balance();
//        cycleArray[1]=(Cycle)new Bicycle();
//        cycleArray[1].balance();
//        cycleArray[2]=(Cycle)new Tricycle();
//        cycleArray[2].balance();

//        downcasting
        Cycle referenceUni=new Unicycle();
        Unicycle unicycle=(Unicycle) referenceUni;
        unicycle.balance();
        Cycle referenceBi=new Bicycle();
        Bicycle bicycle=(Bicycle) referenceBi;
        bicycle.balance();
        Cycle referenceTri=new Tricycle();
        Tricycle tricycle=(Tricycle) referenceTri;
//        tricycle.balance();
    }
}
