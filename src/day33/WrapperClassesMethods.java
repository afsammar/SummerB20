package day33;

public class WrapperClassesMethods {
    public static void main(String[] args) {


        String str = "123";
        int a = Integer.parseInt(str);
        System.out.println(str+1);
        System.out.println(a+1);
        double d1= Double.parseDouble("7.5");
        System.out.println(d1+5);
        String s1 = "true";
        boolean k =Boolean.parseBoolean(s1);
        System.out.println(!k);
        System.out.println("===================================");
        String s2="10000.5";
        Double d2 =Double.valueOf(s2);//unboxing
        System.out.println(d2);
        String s3 ="FaLSe";
        boolean r2=Boolean.valueOf(s3);//unboxing
        System.out.println(r2);

    }
}
