package replitpractises;

public class eaxctNumber {
    public static void main(String[] args) {
        System.out.println(extractNum("aaaa111dd22dd333"));
    }




    public static String extractNum(String s){
       String extract = "";
        for (int i = 0; i<=s.length()-1; i++) {
            if(s.charAt(i)>=48&&s.charAt(i)<=57){
                extract+=s.charAt(i);
            }

        }
    return extract;
    }
}
