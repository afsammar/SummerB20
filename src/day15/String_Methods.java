package day15;

public class String_Methods {
    public static void main(String[] args) {

        String name = "cybertek";
        char ch1 = name.charAt(0);
        char ch2 = name.charAt(5);
        System.out.println(ch1);
        System.out.println(ch2);
        int totalnumberchar = name.length();
        System.out.println(totalnumberchar);
        int lastIndexNmber = name.length()-1;
        System.out.println(lastIndexNmber);
        String schoolName = "Cybertek";
       schoolName= schoolName.concat(" School");
        System.out.println(schoolName);
        String r1 ="Cybertek"+123+'A'+"true";
        System.out.println(r1);
        String r2 ="Cybwrtek".concat("123");

    }
}
