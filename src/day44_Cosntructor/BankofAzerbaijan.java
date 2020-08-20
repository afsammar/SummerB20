package day44_Cosntructor;

import java.util.ArrayList;
import java.util.Arrays;
//import static day44_Cosntructor.HumanResources.*;

public class BankofAzerbaijan {
    public static void main(String[] args) {
        ArrayList<Employee>list = new ArrayList<>();
       /*
        list.add(HumanResources.employee1);
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);*/
       /* list.addAll(Arrays.asList(HumanResources.employee1,employee2,employee3,employee4,employee5));
                //by using the static import we are able to to import static member , so can call them without the class*/

        list.addAll(Arrays.asList(HumanResources.employee1,HumanResources.employee2,HumanResources.employee3));
        System.out.println("Total number of emeplyees: "+list.size());

        System.out.println("===========================================================================");
        for(Employee each : list){
            System.out.println(each.name+" : "+each.salary);
        }
    }
}
