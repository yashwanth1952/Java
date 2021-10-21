package helperClasses;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Query4 {
    public Query4(ArrayList<Student> arrayList){
        System.out.println("4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)");
        System.out.println("Total size of the array is "+arrayList.size());
        arrayList.stream()
                 .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()))
                 .forEach((i,j)->System.out.println("Number of "+i+" students is "+j));
        System.out.println();
    }
}
