package day11_nestedif_switch;

public class numberToWords {
    public static void main(String[] args) {

        int num = 1;
        String result = "";
        if (num ==0){
            result = "0";
        }else if (num ==1){
            result = "one";
        }else if (num == 2){
            result = "two";
        }else if(num==3){
            result="three";
        }else if (num==4){
            result ="four";
        }else if (num ==5){
            result="five";
        }else if (num==6){
            result= "six";
        }else if ( num ==7){
            result="seven";
        }else if (num ==8){
            result="eight";
        }else if (num ==9){
            result= "nine";
        }else {
            result = "invalid";
        }
        System.out.println(num +" = "+ result);
    }
}
