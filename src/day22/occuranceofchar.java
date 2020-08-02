package day22;
import java.util.Scanner;
public class occuranceofchar {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
        int count = 0;

       for(int i=0; i<str.length(); i++){

           char each= str.charAt(i);
           if(each == ch){
               count+=1;
           }

        }

        /*int index = 0;
        while (index <=str.length()-1){

            char each= str.charAt(index);
            if(each == ch){
                count+=1;
            */

        }}


