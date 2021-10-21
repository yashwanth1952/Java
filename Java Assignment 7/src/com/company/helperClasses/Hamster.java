package com.company.helperClasses;

public class Hamster extends Rodent{
    public Hamster(){
        System.out.println("This is Hamster constructor");
    }
    @Override
    public void properties() {
        System.out.println("Hamsters have 8 legs");
    }
}
