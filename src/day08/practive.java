package day08;

public class practive {

    public static void main(String[] args) {
       String firstName = "Aaron";
       String LastName = "Daniel";
       String FullName = firstName +" "+ LastName;

        int age =18  ;
        String citizenShip = "USA";

        boolean eligibleToVote = age >17 && citizenShip == "USA";


        System.out.println(FullName + " is eligilble to vote : " +eligibleToVote );

        boolean r9 = !false == false || true == !false;
        boolean r10 = !false == false && true ==!false;
        System.out.println(r10);



    }
}
