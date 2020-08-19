package day42_Static;

public class Tester {

    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;


    public void setInfo(String name,char gender, long employeeID, String jobTitle,double salary){
        this.name=name;
        this.gender=gender;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }
    public void smokeTesting(){
        System.out.println(name+" smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }
    public String toString(){
        return "name: "+name+", gender:"+gender+", employeeID: "+employeeID+", job title "+jobTitle+", salary: "+salary;
    }

}
