package helperClasses;

import java.util.ArrayList;

public class Query2 {
    public Query2(ArrayList<Student> arrayList){
        System.out.println("2. Get the names of all students who have enrolled after 2018?");
        arrayList.stream()
                 .filter(i->i.yearOfEnrollment>2018)
                 .forEach(i->System.out.println(i.name));
        System.out.println();

    }
}
