package officehours;

import java.util.ArrayList;
import java.util.Arrays;

public class Emplyeesinfo {
    public static void main(String[] args) {
        Employees employee1 =new Employees();
        Employees employee2 =new Employees();
        Employees employee3 =new Employees();
        Employees employee4 =new Employees();

        employee1.setEmployeeInfo("Ammar Afsin",'M',"1234","A1231","QA",70000);
        employee2.setEmployeeInfo("Erkam Afsin",'M',"1245","A1145","QA",95000);
        employee3.setEmployeeInfo("Zafer Demir",'M',"1256","A1143","BA",140000);
        employee4.setEmployeeInfo("Ayse Mas",'F',"5634","A1178","Tester",160000);

        ArrayList<Employees>Employee = new ArrayList<>();
        Employee.addAll(Arrays.asList(employee1,employee2,employee3,employee4));
        for (Employees each:Employee) {
            each.getEmployeeInfo();


        }
        Employee.removeIf(p->p.salary<100000&&p.jobTitle.equals("QA"));
        System.out.println("Nmuber of employees: "+Employee.size());
    }
}
