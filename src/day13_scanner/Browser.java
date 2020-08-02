package day13_scanner;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "safari";
        //boolean,long,double,float are not allowed in swtich

        switch (browserName){
            case "chrome":
                System.out.println("opening chrome browser");
break;
            case"firefox":
                System.out.println("opening Firefox browser");
break;
            case "opera":
                System.out.println("opening oprea browser");
break;
            case"safari":
                System.out.println("opening safari browser");
break;
            case"edge":
                System.out.println("opening edge browser");

            default:
                System.out.println("invalid browser name");
        }
    }

    public static class Scanner_next {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter your company name: ");
            String companyName= input.next();
            System.out.println("your company name: "+companyName);
        }





    }
}
