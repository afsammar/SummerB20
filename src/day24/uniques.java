package day24;

public class uniques {
    public static void main(String[] args) {
        String str = "aabcc";

        String uniques = "";
        for(int i = 0; i <=str.length()-1; i++){
            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);
            if(first==last){
                uniques+=ch;
            }
        }
        System.out.println(uniques);

    }
}
