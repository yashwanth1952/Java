package helperClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Query9 {
    public Query9(ArrayList<Student> arrayList){
        System.out.println("9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)");

        Student student=arrayList.stream()
                .filter(i->(i.gender=="Male" && i.engDepartment=="Electronic"))
                .collect(Collectors.minBy(Comparator.comparing(Student::getAge)))
                .orElse(new Student(3,"asd",4,"sdf","sdf",4000,45));
        System.out.println(student.id+"  "+student.name+"  "+student.age+"  "+student.gender+"  "+student.engDepartment+"  "+student.yearOfEnrollment+"  "+student.perTillDate);
    }
}
