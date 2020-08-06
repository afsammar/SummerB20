package replitpractises;

public class Mergethem178 {
    public static String mergeStrings(String one, String two) {
        String merged = "";
        String longerStr = "";
        int shorter = 0;
        if (one.length() > two.length()) {
            longerStr = one;
            shorter = two.length();
        } else {
            longerStr = two;
            shorter = one.length();
        }
        for (int i = 0; i < shorter; i++) {
            merged = "" + one.charAt(i) + two.charAt(i);
        }
    merged+=longerStr.substring(shorter);
        return merged;
    }
}
