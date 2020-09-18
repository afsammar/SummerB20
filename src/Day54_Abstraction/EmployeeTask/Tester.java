package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public final class Tester extends Emplyee {
    public Tester(String name, char gender, LocalDate DOFB, String jobTitle, double salary){
        super(name,gender,DOFB,jobTitle,salary);
    }
    public void findBug(){
        System.out.println("Find bug");
    }
}
