package com.company;
import helperClasses.*;

public class JavaAssignment12 {
    public static void main(String[] args){
        FillWithData fillWithData=new FillWithData();
        new ExecuteQueries(fillWithData.getList());
    }
}
