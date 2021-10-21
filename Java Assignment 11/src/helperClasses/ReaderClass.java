package helperClasses;

import java.io.*;
import java.util.*;

public class ReaderClass {
    String editedPath="";
    String previousPath = "/home/yashwk/IdeaProjects/Java Assignment 11/src/helperClasses/";
    HashMap<Character, Integer> map = new HashMap<>();
    String mapToString=map.toString();

    public String readFile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name to read: ");
        String fileName = scanner.nextLine();
        editedPath = previousPath + fileName;

        try{
            FileReader file = new FileReader(editedPath);
            int index;
            while((index=file.read())!=-1){
                char currentCharacter=(char) index;
                if(Character.isWhitespace(currentCharacter))continue;
                if(map.containsKey(currentCharacter)){
                    map.put(currentCharacter,map.get(currentCharacter)+1);
                }else{
                    map.put(currentCharacter,1);
                }
            }
            file.close();
        }catch (Exception exception){
            exception.printStackTrace();
        }
        mapToString=map.toString();
        return mapToString;
    }
    public String getPath(){
        return previousPath;
    }
}
