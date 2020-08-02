package day11_nestedif_switch;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int month =2;
        boolean validnumber = month >=1 && month<=12;
        boolean days28 = month ==2;
        boolean days30 = month ==4 || month == 6|| month ==0 ||month ==11;
        String result = "";

        if (validnumber){//for 28 days or 30 days or 31 days
            if (days28){
                result ="28 days";
            }else if (days30){
                result ="30 days";
            }else{
                result = "31 days";
            }

        }else{//invalid months
            result = "invalid month";
        }
        System.out.println(result);
    }
}
