package replitpractises;
import java.util.Scanner;
public class SMS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender="<Mike Smith>";
        String phoneNumber="From Number:[202-123-3456]" ;
        String messageBody="Message:{I love programing and problem solving}";
       int a = message.indexOf('<');
       int a1= message.indexOf('>');
       int a2 = message.indexOf('[');
       int a3 = message.indexOf(']');
       int a4 = message.indexOf('{');
       int a5 = message.indexOf('}');
        System.out.println("Sender: "+message.substring(a+1,a1));
        System.out.println("Phone Number: "+message.substring(a2+1,a3));
        System.out.println("Message body: "+message.substring(a4+1,a5));
    }
}
