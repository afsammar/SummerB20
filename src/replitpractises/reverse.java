package replitpractises;

public class reverse {
    public static void main(String[] args) {
        String str ="Java" ;
        System.out.println("" +str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0));

        String email = "test@gmail.com";
        String domain= email.substring(5,10);
        System.out.println(domain);
    }
}
