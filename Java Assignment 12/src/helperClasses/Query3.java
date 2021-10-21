package helperClasses;

import java.util.ArrayList;

public class Query3 {
    public Query3(ArrayList<Student> arrayList){
        System.out.println("3. Get the details of all male student in the computer sci department?");
        arrayList.stream()
                 .filter(i->(i.engDepartment=="Computer Science" && i.gender=="Male"))
                 .forEach(i->System.out.println(i.id+"  "+i.name+"  "+i.age+"  "+i.gender+"  "+i.engDepartment+"  "+i.yearOfEnrollment+"  "+i.perTillDate));
        System.out.println();
    }
}
