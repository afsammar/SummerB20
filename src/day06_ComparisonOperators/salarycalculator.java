package day06_ComparisonOperators;

public class salarycalculator {
    public static void main(String[] args) {

        //yearly salary :rate*weeklyhours*48weeks
        //total tax : salary *(federaltax +statetax)
        //salary after tax :salary - totaltax
         double rate = 50;
         double stateTaxRate = 0.05;
        double federaltaxRate = 0.2;
        int weeklyHours = 45;

        double salary = rate*weeklyHours*48;
        System.out.println("Salary is:"+ salary+ "$");
        double totaltax =  salary *(federaltaxRate+stateTaxRate);
        System.out.println("Total tax is:" +totaltax+ "$");
        double salaryaftertax = salary - totaltax;
        System.out.println("Salary after tax is:" +salaryaftertax + "$");





    }
}
