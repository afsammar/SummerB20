package replitpractises;
import java.util.Scanner;
public class alejandro2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        String name = "alejandro";
        String project = "project";
        if(a.contains(name)&&a.contains(project)){
            System.out.println("read this mail");
        }else{
            System.out.println("dont read");
        }
    }
}
