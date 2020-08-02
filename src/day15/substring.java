package day15;

public class substring {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        //                 0123456789..
        String word = sentence.substring(0, 3+1);
        System.out.println(word);
        word=sentence.substring(8, 10+1);
        System.out.println(word);
        String sentence2 = "I like movies and TV series";
        String word3 = sentence2.substring(7,13+1);
        System.out.println(word3);
        String firstName="MUHTAR";
        String firstCharacter = firstName.substring(0,1);
        String restOfCharac = firstName.substring(1,firstName.length());
        String firstname =firstCharacter.toUpperCase()+ restOfCharac.toLowerCase();
        System.out.println(firstname);
        int length =firstName.length();
        System.out.println(length);
        String lasntName ="school";
        String firstChar = lasntName.substring(0,1);//s
        String remaining = lasntName.substring(1);//chool
        System.out.println(firstChar);
        System.out.println(remaining);
       lasntName= firstChar.toUpperCase()+remaining.toLowerCase();
        System.out.println(lasntName);
        String s2 = "I like javs progrsmming language";
        String language = s2.substring(7);
        System.out.println(language);

    }
}
