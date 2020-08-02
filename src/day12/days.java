package day12;

public class days {
    public static void main(String[] args) {
        int num =25;
        String result = "";

        switch (num){
            case 5:
                result ="friday";
                break;
            case 1:
                result="monday";
                break;
            case 2:
                result ="tusday";
                break;
            case 3:
               result ="wednesday";
                break;
            case 4:
                result ="thrusday";
                break;
            case 6:
                result = "saturday";
                break;
            case 7 :
                result ="sunday";
                break;
            default:
                result = "invalid number";
        }
        System.out.println(result);
    }
}
