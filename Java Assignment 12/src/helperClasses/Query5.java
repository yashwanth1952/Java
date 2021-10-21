package helperClasses;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;

public class Query5 {
    public Query5(ArrayList<Student> arrayList){
        System.out.println("5. What is the average age of male and female students?");
        arrayList.stream()
                 .collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)))
                 .forEach((x,y)->System.out.println("Average age of "+x+" is "+y));
        System.out.println();
    }
}
