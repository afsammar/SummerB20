package day53_FinalKeyWord;

import java.time.LocalDate;

public class FinalVaraible {
    final static String eyeColor = "Brown";
    final String bloodtype = "A";

    final int x; //final instance variable need to be initilazied rigth away
    final static int y ;

    static {
        y=300;
    }
    public FinalVaraible(){
        x=700;
    }
    public static void main(String[] args) {

        final LocalDate dateOfBirth = LocalDate.of(2000,5,7);
        //dateOfBirth = LocalDate.of(1990,6,5);

        System.out.println(dateOfBirth);

        final long ssn = 1234567;
        System.out.println(ssn);

       final double PI = 3.14;
        //PI = 2.14;

        final char gender = 'M';
        //gender = 'F';
    }
}
