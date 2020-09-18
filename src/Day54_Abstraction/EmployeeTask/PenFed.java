package Day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public class PenFed {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Ahmed Ammar",'M', LocalDate.of(1996,2,3),"SDET",120000);

        System.out.println(tester1.gender);
        System.out.println(tester1.DOFB);
        System.out.println(tester1);
    }
}
