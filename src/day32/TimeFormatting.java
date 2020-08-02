package day32;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat =DateTimeFormatter.ofPattern("MMM/dd/yy, EEEE hh:mm a");
        LocalDateTime ld=LocalDateTime.of(2020,7,25,16,30);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));


        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime now = LocalTime.now();
        System.out.println(now.format(timeFormat));
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime rNow= LocalDateTime.now();
        System.out.println(rNow.format(dtf));

    }
}
