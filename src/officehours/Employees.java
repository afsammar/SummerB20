package officehours;

public class Employees {
    String employeeName;
    char gender;
    String SSN;
    String employeeID;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String emplNme,char emplGender, String emplSSN,String emplID,String emplJobtitle,double emplSalary){
        employeeName=emplNme;
        gender=emplGender;
        SSN=emplSSN;
        employeeID=emplID;
        jobTitle=emplJobtitle;
        salary=emplSalary;
    }
    public void getEmployeeInfo(){
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary"+salary);
        System.out.println("======================================");

    }
    public void attendingMeeting(){
        System.out.println(employeeName+" is attending every meeting.");
    }
    public void working(){
        System.out.println(employeeName+"is wokring");
    }
}
