package day08;

public class Practice3 {
    public static void main(String[] args) {

        int b = 2;
        boolean result = ++b == 2 || --b ==2 &&--b ==2;
        System.out.println(result);

        boolean a1 = true ;
        boolean b1 = !a1;

        boolean c1 = a1 !=b1    &&   a1 == !b1 && !a1 ==b1;
        //       true != false      true ==ture     false == false
        System.out.println(c1);

        int a =2;
        int b5=3;
        if (a<b5){
            System.out.println(b5 + " is greater");
        }
        int num = 1;
            num = -6;
            num = 0;

            if (num == 1);{
        System.out.println("positive");
            }
           if (num == -6);
        {
            System.out.println("negative");
        }
        if ( num == 0);{
            System.out.println("0");
        }

    }
}
