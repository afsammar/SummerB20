package day43_Static;

public class variables {
    int d;
    static int s;

    public void method2(){
        System.out.println(d);
        System.out.println(s);
    }

    public static void main(String[] args) {

        System.out.println(s);
        //System.out.println(d);//static does not accept anything but static

        variables obj =new variables();
        System.out.println(obj.d);
    }
}
