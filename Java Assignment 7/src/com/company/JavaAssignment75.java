package com.company;

class FirstOut{
    class FirstIn{
        public FirstIn(int num){
            System.out.println("This is FirstIn constructor and its argument is "+num);
        }
    }
}
class SecondOut{
    class SecondIn extends FirstOut.FirstIn{
        public SecondIn(FirstOut firstOut,int num) {
            firstOut.super(num);
            System.out.println("This is SecondIn constructor and its argument is "+num);
        }
    }
}
public class JavaAssignment75 {
    public static void main(String[] args){
        FirstOut firstOut=new FirstOut();
        FirstOut.FirstIn firstIn=firstOut.new FirstIn(345);
        SecondOut secondOut=new SecondOut();
        SecondOut.SecondIn secondIn=secondOut.new SecondIn(firstOut,345);
    }
}
//    Create a class with an inner class that has a non-default constructor
//    (one that takes arguments).
//    Create a second class with an inner class that inherits from the first
//    inner class.