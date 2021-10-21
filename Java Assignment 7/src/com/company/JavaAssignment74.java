package com.company;
interface Cycle{
    public void balance();
}
class Unicycle implements Cycle{
    public void balance(){
        System.out.println("This is a unicycle, so balance is required");
    }
}
class Bicycle implements Cycle{
    public void balance(){
        System.out.println("This is a Bicycle, so balance is required");
    }
}
class Tricycle implements Cycle{
    public void balance(){
        System.out.println("This is a Tricycle, no balance is required");
    }
}
class UnicycleFactory{
    public Cycle getCycle(){
        System.out.println("This is unicycle factory");
        return new Unicycle();
    }
}
class BicycleFactory{
    public Cycle getCycle(){
        System.out.println("This is Bicycle factory");
        return new Bicycle();
    }
}
class TricycleFactory{
    public Cycle getCycle(){
        System.out.println("This is Tricycle factory");
        return new Tricycle();
    }
}
public class JavaAssignment74 {
    public static void main(String[] args){
        Cycle unicycle=new UnicycleFactory().getCycle();
        unicycle.balance();
        Cycle Bicycle=new BicycleFactory().getCycle();
        Bicycle.balance();
        Cycle Tricycle=new TricycleFactory().getCycle();
        Tricycle.balance();
    }
}
//    Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
//        Create factories for each type of Cycle, and code that uses these factories.