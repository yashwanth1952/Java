import java.util.Scanner;

public class JavaAssignment9 {
    public static void main(String[] args){
        Scanner inputScanner=new Scanner(System.in);
        String inputLine=inputScanner.nextLine();
        PatternChecker patternChecker=new PatternChecker(inputLine);
        if(patternChecker.check()){
            System.out.println("YES  ,This input starts with a capital letter and ends with a full stop");
        }else{
            System.out.println("NO  ,This input does not start with a capital letter and ends with a full stop");
        }
    }
}
//String and Type Information
//    Using the documentation for java.util.regex.
//        Pattern as a resource, write and test a regular expression
//        that checks a sentence to see that it begins with a capital
//        letter and ends with a period.
