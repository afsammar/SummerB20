package day37_Arraylist;

import day04_variables.Char;
import sun.text.normalizer.UCharacter;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigitsLetters {
    public static void main(String[] args) {
        ArrayList<Character>chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','1','b','2','c','d','$','#','@','?','*'));

        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);

        System.out.println("====================================================");

        ArrayList<Character>list = new ArrayList<>();

        list.addAll(Arrays.asList('a','1','b','2','c','d','$','#','@','?','*'));

        ArrayList<Character> digits =new ArrayList<>();
        digits.addAll(list);
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> letters =new ArrayList<>();
        letters.addAll(list);
        letters.removeIf(p->!Character.isLetter(p));
        System.out.println(letters);
        ArrayList<Character> specialChar =new ArrayList<>();
        specialChar.addAll(list);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println(specialChar);

    }
}
