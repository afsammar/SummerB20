package day47;

public class Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable);//public is acccesible from everywhere
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable);//default is accesible within the same package only
        AccessModifiers.defaultMethod();

        Encapsulation obj1 = new Encapsulation();
        //System.out.println(obj1.ssn);
        System.out.println(obj1.getSsn());

        obj1.setSsn(7654321);

        System.out.println(obj1.getSsn());

    }
}
