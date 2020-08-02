package day31;
import java.util.Scanner;
public class formatFullname {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String first = scan.nextLine();
        String last =scan.nextLine();
        /*first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName =first+" "+last;*/
        String fullName=fullname(first,last);
        System.out.println(fullName);

    }
public static String fullname(String first,String last){
    first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
    System.out.println(first);
    last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
    String fullName =first+" "+last;
    return fullName;
}

}
