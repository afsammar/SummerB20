package day32;

import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {
        LocalTime t1=LocalTime.of(15,45,55);
        System.out.println(t1);

        LocalTime t2 =LocalTime.now();
        System.out.println(t2);
    }
}
