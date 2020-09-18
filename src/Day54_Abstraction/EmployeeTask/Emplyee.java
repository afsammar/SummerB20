package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public class Emplyee {

    public String name;
    final public char gender;
    final public LocalDate DOFB;
    public String jobTitle;
    public double salary;

    public Emplyee(String name, char gender, LocalDate DOFB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOFB = DOFB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+", DOFB: "+DOFB+", Job Title: "+jobTitle+", Salary: "+salary;
    }
}
