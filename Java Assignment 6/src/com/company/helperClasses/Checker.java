package com.company.helperClasses;

import java.util.Arrays;

public class Checker {
    public static boolean checkTrailZeros(String number,int numberSize){
        if(number.charAt(numberSize-1)==number.charAt(numberSize-2) && number.charAt(numberSize-1)=='0')return true;
        return false;
    }
    public static boolean basicCheck(String number,int numberSize){
        if(numberSize%2==1)return false;
        if(checkTrailZeros(number,numberSize))return false;
        return true;
    }
    public static boolean checkPair(String a,String b,String c){
        if(a.length()!=b.length())return false;
        String comb=a+b;
        char numa[]=comb.toCharArray(),numc[]=c.toCharArray();
        Arrays.sort(numa);
        Arrays.sort(numc);
        if(String.valueOf(numa).equals(String.valueOf(numc)))return true;
        return false;
    }
    public static boolean check(int number){
        String stringNumber=Integer.toString(number);
        int numberSize=stringNumber.length();
        if(!basicCheck(stringNumber,numberSize))return false;
        for(int i=1;i*i<=number;i++){
            if(number%i==0 && checkPair(Integer.toString(i),Integer.toString(number/i),stringNumber)){
                return true;
            }
        }
        return false;
    }

}
