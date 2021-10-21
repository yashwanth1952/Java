package com.company;

import helperClasses.ReaderClass;
import helperClasses.WriterClass;

public class JavaAssignment11 {
    public static void main(String[] args) {
        ReaderClass readerClass=new ReaderClass();
        String readText=readerClass.readFile();
        WriterClass writerClass=new WriterClass();
        writerClass.writeFile(readText);
        System.out.println("The details have been successfully written in the fileWithMap file");
    }
}
