package Day29CustomeMethods;

public class Custom_Methods {
    public static void main(String[] args) {
        oddnumbers();
        System.out.println("hello");
        evenNumbers();
    }






    public static void oddnumbers(){

        for (int i =1; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();



    }

    public static void evenNumbers(){
        for(int i =0; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
