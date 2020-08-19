package day39_customClass;

public class Employees {
    String name ;
    char gender;
    int ssn;
    String jobtitle;
    double salary;

    public void setEmployeeInfo(String emplName, char emplGender,String emplJobTitle ,double emplSalary){
        name = emplName;
        gender = emplGender;

        jobtitle=emplJobTitle;
        salary=emplSalary;
    }
    public void getEmployeeInfo(){
        System.out.println("Name : "+name+", Gender : " +gender+", Job Title : "+jobtitle+", Salary"+salary);
    }

}
