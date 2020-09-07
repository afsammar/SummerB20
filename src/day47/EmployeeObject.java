package day47;

public class EmployeeObject {
    public static void main(String[] args) {
        CapitaloneEmployees employee1 = new CapitaloneEmployees("ahmed",24,"QA");

        employee1.setID(123);
        employee1.setAddress("Virginia");
        employee1.setSalary(10000);

        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);

        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

        System.out.println(employee1);
    }
}
