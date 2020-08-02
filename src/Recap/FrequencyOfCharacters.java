package Recap;
import library.Util;
public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "AABBBCCC";//===>>A2B3C3
        String exResult = "";
        String nonDup =Util.removedup(str);
        System.out.println(nonDup);
        for(int i=0; i<=nonDup.length()-1; i++) {
            char ch = nonDup.charAt(i);
            int count = Util.frequency(str, ch);
            exResult += "" + ch + count;
        }
        System.out.println(exResult);
        }
}