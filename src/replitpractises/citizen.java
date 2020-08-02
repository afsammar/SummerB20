package replitpractises;
import java.util.Scanner;
public class citizen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizen=input.nextInt();
        int nonSeniorCitizen=input.nextInt();

        System.out.println("What is new citizen's age? ");
        int age = input.nextInt();
        if( age>=65) {
            System.out.println("New Senior Citizen count " + ++seniorCitizen);
        }if(age<=65) {
            System.out.println("New Non-Senior citizen count " + ++nonSeniorCitizen);

        }
    }
}
