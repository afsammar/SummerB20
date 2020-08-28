package day46_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Cristina");
        System.out.println(employee1);
        System.out.println("======================");
        Employee employee2 = new Employee("Selman","QA");
        System.out.println(employee2);
        System.out.println("======================");
        Employee employee3 = new Employee("Ahmed","QA",123456);
        System.out.println(employee3);
        System.out.println("======================");
        Employee employee4 = new Employee("Mehmet","Tester",123456,120000);
        System.out.println(employee4);
    }
}
