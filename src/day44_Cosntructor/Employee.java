package day44_Cosntructor;

public class Employee {
    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployeed;
    static boolean hasSalary;

    static {//runs first
        isEmployeed=true;
        hasSalary=true;
    }

    public void setEmployeeInfo(String name, int id, int ssn,String jobTitle, double salary,char gender){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;



    }

    public String toString(){
        return "Name: "+name+"\n Gender: "+gender+"\n ID: "+id+"\n SSN: "+ssn+"\n Job title: "+jobTitle+"\n Salary: "+salary;
    }
}
