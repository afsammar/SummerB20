package replitpractises;
import java.util.Scanner;
public class route {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if(start.equals("A")&&end.equals("B")){
            System.out.println("right: B found");
        }else if(start.equals("A")&&end.equals("C")){
            System.out.println("right > down: C found");
        }else if(start.equals("A")&&end.equals("D")){
            System.out.println("right > down > left: D found");
        }else if(start.equals("A")&&end.equals("A")){
            System.out.println("A found");

        }else if(start.equals("B")&&end.equals("C")){
            System.out.println("down: C found");
        }else if(start.equals("B")&&end.equals("D")) {
            System.out.println("down > left: D found");
        }else if(start.equals("B")&&end.equals("B")) {
            System.out.println("B found");
        }else if(start.equals("B")&&end.equals("A")) {
            System.out.println("down > left > up: A found");

        }else if(start.equals("C")&&end.equals("D")) {
            System.out.println("left: D found");
        }else if(start.equals("C")&&end.equals("C")) {
            System.out.println("C found");
        }else if(start.equals("C")&&end.equals("A")) {
            System.out.println("up > left: A found");
        }else if(start.equals("C")&&end.equals("B")) {
            System.out.println("left > up > left: B found");

        }else if(start.equals("D")&&end.equals("A")) {
            System.out.println("up: A found");
        }else if(start.equals("D")&&end.equals("D")) {
            System.out.println("D found");
        }else if(start.equals("D")&&end.equals("B")) {
            System.out.println("up > right: B found");
        }else if(start.equals("D")&&end.equals("C")) {
            System.out.println("up > right > down: C found");
        }

    }
}
