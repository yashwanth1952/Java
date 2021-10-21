package com.company;

import com.company.helperClasses.*;

public class JavaAssignment71 {
    public static void main(String[] args) {
	// write your code here
        Rodent rodentArray[]=new Rodent[4];
        rodentArray[0]=new Mouse();
        rodentArray[1]=new Gerbil();
        rodentArray[2]=new Hamster();
        rodentArray[3]=new Gerbil();
        System.out.println();
        rodentArray[0].properties();
        rodentArray[1].properties();
        rodentArray[2].properties();
        rodentArray[3].properties();

    }
}
