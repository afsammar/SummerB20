package replitpractises;

public class cleanString182 {
    public static void main(String[] args) {
        System.out.println(clean("ebenin amina koyam","amina"));



    }






    public static String clean (String text ,String badWord) {
        String result = "";
        if (text.contains(badWord)){
            result=text.replace(badWord,"");
        }
    return result;
    }
}
