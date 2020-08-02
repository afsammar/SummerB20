package Day29CustomeMethods;

public class ageCalc {
    public static void main(String[] args) {
       age(2000,2020);
    }




    public static void age(int birthyear,int currentyear){
        int age =currentyear-birthyear;
        System.out.println("Your age is: "+age);

    }
}
