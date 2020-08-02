package day20_while_loop;

public class practice3 {
    public static void main(String[] args) {


    String str = "Cybertek";
    String result = "";
    int index = str.length()-1;
    while(index>=0){

        result+=str.charAt(index);

        index--;

    }
        System.out.println(result);
    }}
