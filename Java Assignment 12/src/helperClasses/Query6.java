package helperClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Query6 {
    public Query6(ArrayList<Student> arrayList){
        System.out.println("6. Get the details of highest student having highest percentage ?");
//        Student temp=arrayList.stream()
//                 .sorted((student1,student2)-> Double.compare(student2.getPerTillDate(),student1.getPerTillDate()))
//                .findFirst();
//                .forEach(i->System.out.println(i.perTillDate));
//        System.out.println(arrayList.size());
        Student student=arrayList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getPerTillDate)))
                .orElse(new Student(3,"asd",4,"sdf","sdf",4000,45));
        System.out.println(student.id+"  "+student.name+"  "+student.age+"  "+student.gender+"  "+student.engDepartment+"  "+student.yearOfEnrollment+"  "+student.perTillDate);

    }
}
