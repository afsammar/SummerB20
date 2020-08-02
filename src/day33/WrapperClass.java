package day33;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args){

        Integer num=100;
        int a =100;


        byte t =100;
        int z =t;


        Byte b1=50;
        int n1=b1;

        byte b2 =40;
        //Integer n2=b2;
        double[] arr=new double [3];
        System.out.println(Arrays.toString(arr));


        int p1=300;
        Integer p2 =p1;//autoboxing

        Double r1 =300.0;//unboxing
        double r2=r1;

        long l1 =400;
        Long l2=l1;//autoboxing

        Float f1 = 100.5f;
        Float f2 =f1;     //not autoboxing, not unboxing
    }
}
