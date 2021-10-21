package helperClasses;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment;
    double perTillDate;
    public Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }
    public String getGender(){return this.gender;}
    public Integer getAge(){return this.age;}
    public Double getPerTillDate(){return this.perTillDate;}
    public String getEngDepartment(){return this.engDepartment;}

}
