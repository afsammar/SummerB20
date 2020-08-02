package day23;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "ABAB"; //
        String nonDup="";
        String result="";

        for(int i=0; i<=3; i++){
            char ch=str.charAt(i);
            if(!nonDup.contains(""+ch)){
                nonDup+=ch;
            }
        }
        System.out.println(nonDup);
    }
}
