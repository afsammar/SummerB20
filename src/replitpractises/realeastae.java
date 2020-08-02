package replitpractises;

import java.util.Scanner;
public class realeastae {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        System.out.println("Enter your property type:");
        houseType=scan.next();
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        System.out.println("Do you have a backyard?");
        backyard=scan.nextBoolean();
        System.out.println("Do you have garage?");
        garage=scan.nextBoolean();
        System.out.println("How many spots?");
        garageSpots=scan.nextInt();
        System.out.println("How close is metro station?");
        metroAccessibility=scan.nextFloat();
        System.out.println("How close is highway?");
        highwayAccessibility=scan.nextFloat();
        System.out.println("What's the rating of nearest school?");
        schoolScore=scan.nextFloat();
        System.out.println("Does any of your family members smoking?");
        smoking=scan.nextBoolean();
        if(houseType.equals("Condo")){
            propertyPrice=50000+numberOfBedrooms*30000;
        }
        if(houseType.equals("Townhouse")){
            propertyPrice=75000+numberOfBedrooms*30000;
        }
        if(houseType.equals("Single family home")) {
            propertyPrice=95000+numberOfBedrooms*30000;
        }
        if(backyard==true&&houseType.equals("Condo")){
            System.out.println("Backyard is not available for condo!");
        }else if(backyard=true&&houseType.equals("Townhouse")&&houseType.equals("Single family home")){
            propertyPrice=propertyPrice+ 5000;
        }
        if(garage){
            propertyPrice=propertyPrice+ 20000*garageSpots;
        }
        if(garageSpots>10){
            System.out.println("Pardon, it's not a public parking!");
            propertyPrice=propertyPrice;
        }
        if(metroAccessibility<1.0){
            propertyPrice=propertyPrice+ 10000;
        }else if(metroAccessibility>=1&&metroAccessibility<=3){

        }
        propertyPrice=propertyPrice+5000;
        if(highwayAccessibility<1){
            propertyPrice=propertyPrice+15000;
        }else if(highwayAccessibility>=1&&highwayAccessibility<=3) {
            propertyPrice =propertyPrice+8000;
        }else if(highwayAccessibility>=5&&highwayAccessibility<=20){
            propertyPrice=propertyPrice+4000;
        }
        if(schoolScore>=8&&schoolScore<=10){
            propertyPrice=propertyPrice+45000;
        }else if(schoolScore>=4&&schoolScore<=8){
            propertyPrice=propertyPrice+20000;
        }
    if(smoking){
        propertyPrice=propertyPrice+5000;
    }else {
        propertyPrice = propertyPrice;
    }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");

    }
}
