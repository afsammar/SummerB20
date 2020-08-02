package day12;

public class daysinamonth {
    public static void main(String[] args) {

        int daysinmonth = 5;


        switch (daysinmonth){
            case(2):
                System.out.println("28 days");
                break;
            case(4):
            case(6):
            case(9):
            case(11):
                System.out.println("30 days");
                break;
            case(1):
            case(3):
            case(5):
            case(7):
            case(8):
            case(10):
            case(12):
                System.out.println("31 days");
                break;
            default:
                System.out.println("invalid number");
        }
        int a =10;
        a=20;
        a=30;
        a=50;
        System.out.println(a);


    }
}
