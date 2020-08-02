package day28_Recaps;
 //1. write a program return the frequency of a word from a string


public class Frequency {
    public static void main(String[] args) {
        String str ="javajava";
        int count =0;
        for (int i=0; i<=str.length()-4; i++){
            String s=str.substring(i,i+4);
            if(s.equals("java")) {
                count++;

            }
        }
        System.out.println(count);

    }
}
