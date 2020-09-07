package day49_inheritance.ScrumteamTask;

public class Tester extends Employee {

    public Tester(String name,int age,char gender,double salary,int ID,String jobTitle) {
        setInfo(name,age,gender,salary,ID,jobTitle);
    }
    public void smokeTesting(){
        System.out.println("Tester "+name+" is running smoke test.");
    }
    public void creating(){
        System.out.println(name+" is creating ticket on JIRA");
    }
}
