package day32;
import java.text.DecimalFormat;
public class FormatDecimal {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        double a =22/7.0;
        System.out.println(df.format(a));
        System.out.println(a);


    }
}
