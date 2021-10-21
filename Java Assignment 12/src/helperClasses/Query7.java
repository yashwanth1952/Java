package helperClasses;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Query7 {
    public Query7(ArrayList<Student> arrayList){
        System.out.println("7. Count the number of students in each department? (Hint :use Collectors.groupingBy())");
        arrayList.stream()
                 .collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting()))
                 .forEach((i,j)->System.out.println("The number of students in the "+i+" department is "+j));
    }
}
