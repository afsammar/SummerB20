package day08;

public class odd_even {
    public static void main(String[] args) {

        int number = 100;
        boolean even = number % 2 == 0;
        boolean odd = !even;

        if (even){
            System.out.println(number + " is even numer");

    }
        if (odd){
            System.out.println(number + "is odd number ");
        }

    }}

