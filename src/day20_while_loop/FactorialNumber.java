package day20_while_loop;

public class FactorialNumber {
    public static void main(String[] args) {
        int result =1;
        for (int i =5; i>=1; i-=1){
            result*=i;//result*i=result

        }
        System.out.println(result);
    }
}
