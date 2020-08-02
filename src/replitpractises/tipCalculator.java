package replitpractises;
import java.util.Scanner;
public class tipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean split;
        int numberOfPeople;
        String serviceQuality;
        double totalPerPeson, totalPay,totalTip, tipPerPerson, checkAmount;

        System.out.println("Split:");
        split = scan.nextBoolean();
        System.out.println("Number of people:");
        numberOfPeople = scan.nextInt();
        System.out.println("Check Amount:");
        totalPay = scan.nextDouble();
        System.out.println("Service Quality");
        serviceQuality = scan.next();
        if(serviceQuality.equals("Poor")) {
            totalTip = totalPay*0.05;
        }else if(serviceQuality.equals("Fair")){
           totalTip = totalPay*0.10;
        }else if(serviceQuality.equals("Good")){
            totalTip = totalPay*0.15;
        }else if(serviceQuality.equals("Great")){
            totalTip= totalPay*0.20;
        }else if(serviceQuality.equals("Excellent")) {
            totalTip = totalPay * 0.25;
        }
        totalPerPeson=totalPay/numberOfPeople;

            System.out.println("Number of people entered: "+numberOfPeople);
        System.out.println("Total to pay: "+totalPay);
        System.out.println("Total tip: ");
        System.out.println("Total per person: "+(totalPay)/numberOfPeople);
        System.out.println("Tip per person: " );


}}
