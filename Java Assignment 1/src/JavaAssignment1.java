import java.io.File;
import java.util.Scanner;

public class JavaAssignment1 {
    public  static void main(String[] args){
        Scanner inputScanner=new Scanner(System.in);
        while(true){
            String inputRegexPattern = inputScanner.next();
            System.out.println(inputRegexPattern);
            PathProvider pathProvider = new PathProvider(inputRegexPattern);
        }
    }
}

//Create a java program to search through the home directory and look for files
// that match a regular expression.
//The program should be able to take inputs repeatedly and should print out the
//full absolute path of the matching files found.
//Provide appropriate documentation and comments on your code.