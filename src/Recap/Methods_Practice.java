package Recap;

public class Methods_Practice {
    public static void main(String[] args) {
        larger(5,6);
        System.out.println(max(20,30)*30);

    }

public static void larger(int a, int b){

        if(a>b){
            System.out.println("Max: "+a);
        }else if(b>a){
            System.out.println("Max: "+b);
        }else{
            System.out.println("equal");
        }
}
public static int max(int a,int b){

        return (a>b)?a:b;
}

}
