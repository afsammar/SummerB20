package day32;

import java.time.LocalDate;

public class Practise1 {
    public static void main(String[] args) {
        String[]students = {"Kalbinur","Virginia","Odina","Ernis","Isa"};
        LocalDate[]birthdays = {
                                LocalDate.of(1993,12,26),
                                LocalDate.of(1993,11,25),
                                LocalDate.of(1980,05,23),
                                LocalDate.of(1990,02,21),
                                LocalDate.of(1982,11,28)
                                };
        for(int i =0; i<=students.length-1; i++){
            System.out.println(students[i]+" "+birthdays[i]);
        }
        System.out.println("=================================");
        for(LocalDate each:birthdays) {
            System.out.println(each);
        }
    }
}
