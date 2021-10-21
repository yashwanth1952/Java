package helperClasses;
import helperClasses.*;

import java.util.ArrayList;

public class Query1 {
    public Query1(ArrayList<Student> arrayList){
        System.out.println("1. Print the name of all departments in the college?");
        arrayList.stream()
                 .map(i -> (i.engDepartment)).distinct()
                 .forEach(i->System.out.println(i));
        System.out.println();
    }
}
