package day44_Cosntructor;

public class HumanResources {

    static Employee employee1;
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

   // employee1 = new Employee;
    static {
        employee1=new Employee();
        employee2=new Employee();
        employee3=new Employee();
        employee4=new Employee();
        employee5=new Employee();

        employee1.setEmployeeInfo("muhammed",123456,465789,"SDET",120000,'M');
       employee2.setEmployeeInfo("kerem",123476,465789,"SDET",120000,'M');
       employee3.setEmployeeInfo("ammar",433456,465789,"QA",120000,'M');
       employee4.setEmployeeInfo("mehmet",623456,465789,"SDET",120000,'M');
       employee5.setEmployeeInfo("ahmed",173456,465789,"QA",120000,'M');
   }

}
