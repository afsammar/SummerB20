package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public final class Developer extends Emplyee {
    public Developer(String name, char gender, LocalDate DOFB, String jobTitle, double salary){
        super(name, gender,DOFB,jobTitle,salary);
    }


}

//class BA extends Developer{ } //final class ca never be super class
