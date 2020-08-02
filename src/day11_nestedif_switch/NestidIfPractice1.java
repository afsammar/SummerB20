package day11_nestedif_switch;

public class NestidIfPractice1 {
    public static void main(String[] args) {
        int num = 4;
        boolean validnum = 1<=num &&num<=7;
        String result = "";

        if (1<=num &&num<=7){
            if (num==1){
                result = ("sunday");
            }
            else if (num == 2) {
                result =("monday");
            }else if (num == 3) {
                result =("tuesday");
            }else if (num == 4) {
                result =("wednesday");
            }else if (num == 5) {
                result =("thurdsay");
            }else if (num == 6) {
                result =("friday");
            }else if (num == 7) {
                result =("saturday");
            }

        }else {
            result = "invalid number";
        }
        System.out.println(result);
        System.out.println("=====================");
        if(validnum) {
            result = (num == 7) ? "sunday" : (num == 6) ? "Saturday" : (num == 5) ? "Friday" : (num == 4) ? "Thursday" : (num == 3) ? "wednesday"
                    : (num == 2) ? "tuesday" : "Monday";
        }else{
            result="invalid number";
        }
        System.out.println(result);




    }
}
