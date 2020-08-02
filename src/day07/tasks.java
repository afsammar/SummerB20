package day07;

public class tasks {
    public static void main(String[] args) {
        int a = 1;
        a = -a-- + a++ / -a--*--a;

        //a= -1   + 0   /-1 * -1
        //a= -1   + 0  *  -1
        //a= -1   + 0
        //a= -1
        System.out.println(a);
        int b = 50;
        b = --b + b++ + b-- +b++;
        // 49 + 49 + 50 + 49
        System.out.println(b);
        int x = 4;
        int y = x * 4 - x++;
        // 16 - 4
        System.out.println(y);


    }
}
