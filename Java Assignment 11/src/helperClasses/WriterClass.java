package helperClasses;

import java.io.FileWriter;

public class WriterClass {
    public void writeFile(String text){
        ReaderClass readerClass=new ReaderClass();
        String editedPath = readerClass.getPath() + "fileWithMap";

        try{
            FileWriter file = new FileWriter(editedPath);
            file.write(text);
            file.close();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
