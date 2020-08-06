package replitpractises;

public class wordCount181 {
    public static void main(String[] args) {
        int a =wordCount("ahmed ammar afsin");
        System.out.println(a);
    }



    public static int wordCount(String words){

    String []allWords = words.split(" ");
    return allWords.length;
    }
}
