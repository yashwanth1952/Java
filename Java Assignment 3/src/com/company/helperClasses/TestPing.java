package com.company.helperClasses;

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Collections.sort;

public class TestPing {
    public TestPing() {
        try{
            String website="google.com";
            Process p = Runtime.getRuntime().exec("ping "+website+" -c 5");
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            String s = "";
            // reading output stream of the command
            ArrayList<Double> arrayList=new ArrayList<>();
            String pingResult="";
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
                pingResult+=s;
            }
            Pattern pattern=Pattern.compile("([t][i][m][e][=])([0-9\\.]*)");
            Matcher match=pattern.matcher(pingResult);
            while(match.find()){
                arrayList.add(Double.parseDouble(match.group(2)));
            }
            sort(arrayList);
            System.out.println(arrayList);
            System.out.println("The median of the time taken to ping google.com is "+ arrayList.get(2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
