package day09;

public class max {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = 7;

        boolean amax = a > b && a > c;
        boolean bmax = b > a && b > c;
        boolean cmax = c > b && c > a;


        //double max = 0;  // we want to assign the maximum number to variable max


        if (amax ) {

            //max = a;
            System.out.println(a+"is the greatest number");
        }
        if (bmax ) {

            System.out.println(b+" is the greatest number");
            if (cmax ) {

                System.out.println(c+" is the greatest number");
            }
        }
    }}
