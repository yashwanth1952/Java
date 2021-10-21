package com.company.helperClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BackDate {
    String signupDateString="";
    String currentDayDateString="";
    public BackDate(String signupDate,String currentDayDate ){
        this.signupDateString=signupDate;
        this.currentDayDateString=currentDayDate;
    }
    public int[] getDate(String str)
    {
        String [] s=new String[3];
        s=str.split("-");
        int arr[]=new int[3];
        arr[0]=Integer.parseInt(s[0]);
        arr[1]=Integer.parseInt(s[1]);
        arr[2]=Integer.parseInt(s[2]);

        return arr;
    }
    public void calculateDate(){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-YYYY");
        LocalDate c1;
        LocalDate c2;

            int SignupDate[] = getDate(signupDateString);
            int CurrentDate[] = getDate(currentDayDateString);
            try {
                c1 = LocalDate.of(SignupDate[2], SignupDate[1], SignupDate[0]);
//                                 year           month           day
                c2 = LocalDate.of(CurrentDate[2], CurrentDate[1], CurrentDate[0]);
            if(c1.isAfter(c2))
            {
                System.out.println("No ranges");
                return;
            }

            c1 = LocalDate.of( CurrentDate[2], SignupDate[1],SignupDate[0]);
            LocalDate currDate = c2;

            c1=c1.minusDays(30);
            if(c1.isAfter(c2))
            {
                System.out.println("No ranges");
                return;
            }
            System.out.print(formatter.format(c1));

            c1=c1.plusDays(60);
            if(c1.isAfter(currDate))
                System.out.println(" "+formatter.format(currDate));
            else
                System.out.println(" "+formatter.format(c1));
            }
            catch (Exception e){
                System.out.println("Invalid Input ");
            }
        }
    }


