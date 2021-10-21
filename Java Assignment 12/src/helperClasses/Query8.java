package helperClasses;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Query8 {
    public Query8(ArrayList<Student> arrayList){
        System.out.println("8. What is the average percentage achieved in each department?");
        arrayList.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate
                        )))
                .forEach((i,j)->System.out.println("The average percentage of the "+i+" department is "+j));
    }
}
