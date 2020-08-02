package day12;

public class biggernumber {
    public static void main(String[] args) {
        double n1 =250;
        double n2 =200;
        double n3 = 00;
        boolean n1IsBigger = n1>n2 &&n1>n3;
        boolean n2Isbigger = n2>n1 && n2>n3;

        String result = "";

        if (n1IsBigger){
        result = "n1 is bigger";
        }else if (n2Isbigger){
            result = "n2 is bigger";
        }else{
            result = "n3 is bigger";
        }
        System.out.println(result);
        String biggestnumber = n1IsBigger ? "n1 is bigger" :n2Isbigger? "n2 is bigger": "n3 is bigger number";
        System.out.println(biggestnumber);


    }
}
