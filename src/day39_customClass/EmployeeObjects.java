package day39_customClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        Employees employee4 = new Employees();
        Employees employee5 = new Employees();

        employee1.setEmployeeInfo("Ammar",'M',"Manager",100000);
        employee2.setEmployeeInfo("Erkam",'M',"Finance Director",120000);
        employee3.setEmployeeInfo("Zafer",'M',"Developer",100300);
        employee4.setEmployeeInfo("Muhtar",'M',"Developer",100500);
        employee5.setEmployeeInfo("Fatih",'M',"Tester",300000);

       /* employee1.getEmployeeInfo();
        employee2.getEmployeeInfo();
        employee3.getEmployeeInfo();
        employee4.getEmployeeInfo();
        employee5.getEmployeeInfo();*/

        ArrayList<Employees>employeelist =new ArrayList<>();
        employeelist.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));
        String name = "";
        double max = Integer.MIN_VALUE;
        for (Employees each : employeelist) {
            each.getEmployeeInfo();

            double eachSalary=each.salary;
            if(eachSalary>max){
                max = eachSalary;
                name = each.name;
            }

        }


        System.out.println("Max Salary: "+max);
       System.out.println("Name : "+name);
        System.out.println("============================== ");

        employeelist.removeIf(p->p.salary<150000);

        for(Employees each: employeelist){
            each.getEmployeeInfo();
            System.out.println(each.name+" : "+each.salary);
        }


    }
}
