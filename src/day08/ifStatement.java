package day08;

public class ifStatement {
    public static void main(String[] args) {

        int a = 100;
        int b = 100;


    if ( a>b){
        System.out.println( a + " is the larger number");

    }
    if (b>a){
        System.out.println( b + "is the larger number");
    }

    if (a==b){
        System.out.println(  "Both are equal");
    }
     boolean Breaktime = true;
    if(Breaktime == true){
        System.out.println("Take 15 minutes break!");

    }
    if (Breaktime == false){
        System.out.println("Keep studying");

    }
    boolean corona = true;
        if (corona ==true) {

            System.out.println("buy more toilet papers");
            System.out.println("social distance");
            System.out.println("stay at home");

        }



    }
}
