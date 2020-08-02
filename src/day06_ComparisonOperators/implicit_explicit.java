package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {

        short s1= 100;
        long l1 = s1; //implicit casting: automatically done
        long l2 = (long)s1;
        int i1 = 300;
        double d1 = i1;
        //implicit csting is alwasy done automatically

        System.out.println("============================");
        double e1 = 400.55555;
        int j1 = (int)e1;
        System.out.println(j1);
        long L1 = 4400;
        short sh1 = (short)L1;
        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1);
        long r1 = -500;
        int k1 = (int) r1;
        long r2 = 13;
        byte k2 = (byte)r2;

    }
}
