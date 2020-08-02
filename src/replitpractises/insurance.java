package replitpractises;
import java.util.Scanner;
public class insurance {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        name=scan.next();

        System.out.println("Do you have a US driver license?");
        String dl = scan.nextLine();

        switch (dl){
            case ("no"):
                System.out.println("Invalid data!");
                System.exit(0);
                break;
        }
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        switch (zipcode){
            case(20910):
                premium+=60;
                break;
            case (20740):
                premium+=60;
                break;
            case(22102):
                premium+=30;
                break;
            case(22103):
                premium+=30;
                break;
            default:
                premium+=50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership=scan.nextLine();
        switch (vehicleOwnership){
            case("owned"):
            premium+=10;
            break;
            default:
            premium+=20;
}

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage=scan.nextLine();
        switch (vehicleUsage){
            case("Business"):
                premium+=50;
                break;
            case("Pleasure"):
                premium+=10;
                break;
            case("Commuted"):
                premium+=20;
        }
        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool=scan.nextInt();
        switch (daysDrivenToWorkOrSchool){
            case(7):
                premium+=5;
        }
        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool=scan.nextInt();
        premium+=milesToWorkOrSchool*1;

        System.out.println("How old are you?");
        int age =scan.nextInt();
        if (age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if(age>=16&&age<=18){
            premium*=20;
        }else if(age>=18&&age<=21){
            premium*=6;
        }else if(age>=21&&age<=25){
            premium*=2;
        }
        System.out.println("How many years you've been driving?");
    int experience = scan.nextInt();
    if(experience<=0&&age-experience<16){
        System.out.println("Invalid data!");
        System.exit(0);
    }else{
        premium-=5*experience;
    }
        System.out.println("Have you had any accidents in the last 5 years?");
   String accidents=scan.next();
   if(accidents.equalsIgnoreCase("yes")){
       System.out.println("How many?");
       accidentsAmount=scan.nextInt();
       premium+=premium*accidentsAmount*0.20;
   }
        System.out.println("Have you had continuous insurance for the past 12 months?");
   continuousInsurance=scan.nextLine();
   if(continuousInsurance.equalsIgnoreCase("No")){
       premium*=2;
   }
        System.out.println("What is the highest level of education you have completed?");
     education = scan.nextLine();
     if(education.equals("PhD")||education.equals("Bachelors")||education.equals("Masters")){
         premium+=premium*0.05;
     }else if(education.equals("Doctors")){
         premium-=premium*0.10;
     }else if(education.equals("Less than High School")){
         premium+=premium*0.05;
     }
        System.out.println(name+"here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        referenceNumber=name.substring(0,3)+age+name.substring(name.length()-2,name.length()-1)+zipcode+education;
        System.out.println("Reference number: "+referenceNumber);
    }
}
