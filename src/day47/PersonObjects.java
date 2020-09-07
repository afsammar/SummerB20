package day47;

import java.time.LocalDate;

public class PersonObjects {
    public static void main(String[] args) {
        Person obj1 = new Person("Ahmed",24,'M', LocalDate.of(1996,3,2));
        System.out.println(obj1);

        obj1.setSsn(987654);
        obj1.setID(98);
        obj1.setAddress("California");

        System.out.println(obj1.getID());
        System.out.println(obj1.getSsn());
        System.out.println(obj1.getAddress());
    }
}
