package replitpractises;

public class reverse191 {
    public static void main(String[] args) {
        System.out.println(reverse("ammar"));
    }


    public static String reverse(String input){

        String result = "";

        for(int i =input.length()-1; i>=0; i--){
            result+=input.charAt(i);
        }
    return result;
    }
}
