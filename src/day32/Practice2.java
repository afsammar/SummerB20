package day32;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {
        String[]students = {"Kalbinur","Virginia","Odina","Ernis","Isa"};
        LocalDate[]birthdays = {
                LocalDate.of(1993,12,26),
                LocalDate.of(1993,11,25),
                LocalDate.of(1980,05,23),
                LocalDate.of(1990,02,21),
                LocalDate.of(1996,03,02)
        };

        DateTimeFormatter dateFromat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");
    for(int i =0; i<=students.length-1; i++){
        System.out.println(students[i]+" : "+birthdays[i].format(dateFromat));
    }

    }
}
