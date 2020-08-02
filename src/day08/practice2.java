package day08;

import java.net.Socket;

public class practice2 {
    public static void main(String[] args) {
        String Fullname = "Ammar "+"Afsin";
        int age = 42;
       String citizen1 = "USA";
       String citizen2 = "France";

       boolean eligibleAge = age >=18;
       boolean UsaCitizen = citizen1 == "USA" || citizen2 =="USA";

       boolean eligibleToVote = eligibleAge && UsaCitizen;

        System.out.println(eligibleAge);
        System.out.println(Fullname + " is " + " eligible to vote : "+ eligibleToVote );





    }
}
