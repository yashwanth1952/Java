package helperClasses;

import java.util.ArrayList;

public class ExecuteQueries {
    public ExecuteQueries(ArrayList<Student> arrayList){
        new Query1(arrayList);
        new Query2(arrayList);
        new Query3(arrayList);
        new Query4(arrayList);
        new Query5(arrayList);
        new Query6(arrayList);
        new Query7(arrayList);
        new Query8(arrayList);
        new Query9(arrayList);
        new Query10(arrayList);
    }
}
//        1. Print the name of all departments in the college?
//        2.Get the names of all students who have enrolled after 2018?
//        3. Get the details of all male student in the computer sci department?
//        4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
//        5.What is the average age of male and female students?
//        6.Get the details of highest student having highest percentage ?
//        7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
//        8. What is the average percentage achieved in each department?
//        9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
//        10.How many male and female students are there in the computer science department?