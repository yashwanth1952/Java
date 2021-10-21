package helperClasses;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Query10 {
    public Query10(ArrayList<Student> arrayList){
        System.out.println("10. How many male and female students are there in the computer science department?");
        arrayList.stream()
                 .filter(i->i.engDepartment=="Computer Science")
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()))
                .forEach((i,j)->System.out.println(i+"  "+j));
    }
}
