package day43_Static;



public class CybertekStudent {
    //for the advantages of static

        String studentName;
        int age;
        char gender;

        static String schoolName = "Cybertek School";

        public void getInfo(){
                System.out.println("Name: "+studentName);
        }

        public  void printSchoolName(){
                System.out.println("School Name:"+schoolName);
        }



}
