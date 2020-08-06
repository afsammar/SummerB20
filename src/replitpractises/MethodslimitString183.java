package replitpractises;

public class MethodslimitString183 {
    public static void main(String[] args) {
        System.out.println(limit("ammar",3));
    }







    public static String limit(String text, int maxLength){
        return text.substring(0,maxLength);
    }
}
