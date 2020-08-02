package Day19_Forloop;

public class oddeven2 {
    public static void main(String[] args) {
        String str = "Cyber";

        String result = "";
        for(int i = str.length()-1; i>=0; i-=1){
            result+= str.charAt(i);
        }
        System.out.println(result);
    }
}
