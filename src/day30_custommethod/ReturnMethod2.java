package day30_custommethod;

public class ReturnMethod2 {
    public static void main(String[] args) {
        String name ="Level";
        reverse1(name);
       // System.out.println(name.equalsIgnoreCase(reverse1(name)));
        String reversedName =reverse2(name);
        System.out.println(name.equalsIgnoreCase(reverse2(name)));
    }





    public static void reverse1(String str){
        String result="";
        for(int i = str.length()-1; i>=0; i--){
            str.charAt(i);
            result+=str.charAt(i);
        }
        System.out.println(result);
    }

    public static String reverse2(String str){
        String result="";
        for(int i = str.length()-1; i>=0; i--){
            str.charAt(i);
            result+=str.charAt(i);
        }
        return result;
    }


}
