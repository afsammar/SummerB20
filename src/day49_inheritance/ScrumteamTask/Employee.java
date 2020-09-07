package day49_inheritance.ScrumteamTask;

public class Employee extends Person {

    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name,int age,char gender,double salary,int ID,String jobTitle){
        setPersonInfo(name,age,gender);
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;

    }

    public void wokr(){
        System.out.println(name+"is working");
    }
    public String toString(){
        return "ID"+ID+", Job Title: "+jobTitle+
                ", Name: "+name+", Age: "+age+", Gender: "+
                gender+", Salary: $"+salary;
    }


}