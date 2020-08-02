package day09;

public class min {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean mina = a<b && a<c;
        boolean minb = b<a && b<c;
        boolean minc = c<a && c<a;

        double min = 0;

        if (mina){
            min = a;
        }
        if (minb){
            min=b;
        }
        if (minc){
            min=c;
        }
        System.out.println(min+"is the minimum number");
    }

}
