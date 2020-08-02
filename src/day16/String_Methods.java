package day16;

public class String_Methods {
    public static void main(String[] args) {

        String email = "cybertek@gmail.com";
        email =email.replace("gmail","yahoo");
        System.out.println(email);

        String word ="java";
        word=word.replace("a","e");
        System.out.println(word);

        String sentence = "I like to learn Java,Java is cool,Java is fun";
        sentence =sentence.replace("n java","n C#");
        System.out.println(sentence);


        String s1 = "Ilike to in Cybertek, Cybertek is nice place.";
       s1= s1.replace("Cybertek", "MIT");
        System.out.println(s1);
        String s2 = "I like to leaRn Java";
       s2= s2.replace('R','r');
       String s3 = "I like to drink tea and tea";
       s3=s3.replaceFirst("tea","cola");
        System.out.println(s3);
        String s4 ="I like to Watch Game of Thrones , and Walking Dead";
        s4=s4.replace("and Walking Dead","");
        System.out.println(s4);


        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2= s5.indexOf("re");//returns the first char 'r' index

        System.out.println(r1);
        System.out.println(r2);

        //lastIndexOf()
        String s6 ="Java is a programming language, and Java is fun";

        int I1 = s6.indexOf("J")+1;
        int I2 = s6.lastIndexOf("J");
        System.out.println(I1);
        System.out.println(I2);


        String s7 = "Java";
        int a =s7.indexOf("A");
        String s8 = "Java";
        int a1 = s8.indexOf("a");
        char ch = s8.charAt(a1);
        System.out.println(ch);


    }
}
