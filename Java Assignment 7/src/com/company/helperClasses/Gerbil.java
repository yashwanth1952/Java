package com.company.helperClasses;

public class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("This is Gerbil constructor");
    }
    @Override
    public void properties() {
        System.out.println("Gerbils have 4 legs");
    }
}
