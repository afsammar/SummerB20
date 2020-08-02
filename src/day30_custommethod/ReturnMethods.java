package day30_custommethod;

public class ReturnMethods {
    public static void main(String[] args) {
        addition1(3,4);
        int sum =addition2(100,200);
        System.out.println(addition2(3,4)*5);
    }
    public static void addition1(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
public static int addition2(int a , int b ){
        int sum=a+b;
        return sum;
}
}
