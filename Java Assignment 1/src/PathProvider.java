import java.io.File;
import java.util.regex.Pattern;

public class PathProvider {
    String givenRegexPattern="";
    String homePath="/home";
    public PathProvider(String givenRegexPattern){
        this.givenRegexPattern=givenRegexPattern;
        fileMatcher(homePath,givenRegexPattern);
    }
    public void fileMatcher(String currentPath,String givenRegexPattern){
        File currentFile=new File(currentPath);
        if(Pattern.matches(givenRegexPattern,currentFile.getName())){
            System.out.println(currentFile.getAbsolutePath()+"  "+currentFile.getName());
        }
        File[] files=currentFile.listFiles();
        if(files!=null) {
            for (File file : files) {
                fileMatcher(file.getAbsolutePath(), givenRegexPattern);
            }
        }

    }
}
