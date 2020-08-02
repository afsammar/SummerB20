package Recap;

public class mthodpractice2 {
    public static void main(String[] args) {
        reverse1("ammar");
        System.out.println(reverse2("Ammar"));

    }

public static void reverse1(String str){
       String ExResult="";
        for(int i =str.length()-1;i>=0;i--){
            ExResult+= str.charAt(i);
        }
    System.out.println(ExResult);
}
public static String reverse2(String str){
    String ExResult="";
    for(int i =str.length()-1;i>=0;i--) {
        ExResult += str.charAt(i);
    }
    return ExResult;
}


}
