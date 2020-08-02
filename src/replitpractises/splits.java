package replitpractises;
import java.util.Scanner;
public class splits {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {

        String[] split = info.split(",");
        System.out.println("person name: "+split[0]
                +" last name: "+split[1]
                +" age: "+split[2]);


    }//end person
}
