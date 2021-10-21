package com.company;

import com.company.helperClasses.Slist;
import com.company.helperClasses.SlistIterator;

public class JavaAssignment10 {
    public static void main(String[] args) {

        Slist<Integer> slist=new Slist<Integer>();
        SlistIterator<Integer> it=slist.getIterator();

        slist.tostring();
        it.insert(10);
        slist.tostring();
        it.insert(23);
        slist.tostring();
        it.insert(54);
        slist.tostring();
        it.insert(98);
        slist.tostring();
        it.remove();
        slist.tostring();
    }
}
