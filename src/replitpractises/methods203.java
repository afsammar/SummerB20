package replitpractises;

public class methods203 {
    public static boolean isPalindrome(String check) {
        String word = "";

        for(int i = check.length()-1 ; i>=0 ; i--) {
            word += check.charAt(i);
        }
            return (word.replace(" ","").equalsIgnoreCase(check.replace(" ","")));

    }
}
