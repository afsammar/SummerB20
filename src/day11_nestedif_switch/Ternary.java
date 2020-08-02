package day11_nestedif_switch;

public class Ternary {
    public static void main(String[] args) {

        int num = 100;
        String result = (num%2==0) ? "even" : "odd" ;
        System.out.println(result);
        System.out.println("=====================================");

        int num1 = 1000;
        int num2 = 20;

        int max1 = 0;
        if(num1 > num2){
            max1 = num1;
        }else {
            max1=num2;

        }
        System.out.println(max1);
        int max2 = (num1>num2) ? num1 : num2;
        System.out.println(max2);
        int age =25;
        boolean elgibile = false;

        if ( age >21){
            elgibile =true;
        }else {
            elgibile =false;
        }
        System.out.println(elgibile);
        String result1 = (age>21 ? "eligble" : "uneligible");
        System.out.println(result1);

    }
}
