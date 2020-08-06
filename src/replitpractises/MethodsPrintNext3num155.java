package replitpractises;
import java.util.Scanner;
public class MethodsPrintNext3num155 {
    public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
    int num = inp.nextInt();
    next3(num);
}
public static void next3(int num){
    System.out.print(num+1+" ");
    System.out.print(num+2+" ");
    System.out.print(num+3);

}

}
