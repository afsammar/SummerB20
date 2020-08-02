package day11_nestedif_switch;

public class Ternary_practice_2 {
    public static void main(String[] args) {

        int num = 100;
        String result = "";
        if (num >00){
            result = "Positive";
        }else if ( num < 0){
            result  = "negative";
        }else {
        result = "zero";
    }
    String result2 = (num <0) ? "Positive" : (num>0)? "Negative" : "zero";

        int a = 10;
        int b = 20;

        String r = (a >b) ? "a is greater":(a<b)? "b is greater":"a and b equal";
        System.out.println(r);

        int x =4;

        String res = 2>=5?  "x" :"-x";
        System.out.println(res);

int num1=29;
int num2=28;

int res1 = num1>num2? num1 : num2;
        System.out.println(res1);


}}
