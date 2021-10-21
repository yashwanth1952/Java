import java.util.Scanner;

public class JavaAssignment2 {
    public static void main(String[] args){
        Scanner inputScanner=new Scanner(System.in);
        String inputString=inputScanner.nextLine();

        Checker checker=new Checker(inputString);
        if(checker.check())System.out.println("The inputString contains all the letters");
        else System.out.println("The inputString does not contain all the letters");
    }
}
// The time complexity for this question is O(n)
// The space complexity for this question is O(26)