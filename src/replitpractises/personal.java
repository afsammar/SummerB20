package replitpractises;
import java.util.Scanner;
public class personal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        input.nextLine();
        String lastName = input.nextLine();
        String fullName = firstName + ", " + lastName;
        System.out.println("Enter your email");
        String email = input.nextLine();
        System.out.println("Enter your street");
        String street = input.nextLine();
        System.out.println("Enter your city ");
        String city = input.nextLine();
        System.out.println("Enter your state");
        String state = input.nextLine();
        System.out.println("Enter your zipcode");
        int zipcode = input.nextInt();
        String address = street + ", " + city + ", " + state + " " + zipcode;
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your height");
        double height = input.nextDouble();
        System.out.println("Enter your weight");
        double weight = input.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = input.nextBoolean();
        System.out.println("Enter your workphone number");
        long workphonenumber = input.nextLong();
        System.out.println("Enter your personal phone number");
        long personalphonenumber = input.nextLong();
        String contacts = "work phone number- " + workphonenumber + ", personal phone number- " + personalphonenumber + ", " +
                "email: " + email;
        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts);
        System.out.println("email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Married?: " + isMarried);

    }
}
