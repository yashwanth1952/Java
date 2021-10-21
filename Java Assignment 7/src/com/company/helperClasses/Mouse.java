package com.company.helperClasses;

public class Mouse extends Rodent{
    public Mouse(){
        System.out.println("This is Mouse constructor");
    }
    @Override
    public void properties() {
        System.out.println("Mouses have 2 legs");
    }
}
