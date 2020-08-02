package day10;

public class digit {
    public static void main(String[] args) {


    char character = 'a';

    boolean isdigit = character >= 48 && character <=57;

    String dig = "";

    if (isdigit){
        dig = character +"is a digit";
    }else{
        dig = character+"is not a digit";
    }
        System.out.println(dig);
}}
