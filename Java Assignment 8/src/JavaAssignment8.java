import helperClasses.*;

public class JavaAssignment8 {
    public static void main(String[] args) throws LastDigitIs0,StringSizeLessThan8,GreaterThan10 {
        try{
            int a=10000;
            if(a%10==0)throw new LastDigitIs0();

            if(a>10)throw new GreaterThan10();

            String s="asdfad";
            if(s.length()<8)throw new StringSizeLessThan8();

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("This statement is printed by finally block");
        }
    }
}


//Create three new types of exceptions.
//        Write a class with a method that throws all three.
//        In main( ), call the method but only use a single catch clause
//        that will catch all three types of exceptions.
//        Add a finally clause and verify that your finally clause is executed,
//        even if a NullPointerException is thrown.