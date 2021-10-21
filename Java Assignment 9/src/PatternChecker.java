import java.util.regex.Pattern;

public class PatternChecker {
    String inputLine="";
    String pattern="[A-Z]+[\\w\\s]*[.]";
    public PatternChecker(String inputLine){
        this.inputLine=inputLine;
    }
    public boolean check(){
        return Pattern.matches(pattern,inputLine);
    }
}
