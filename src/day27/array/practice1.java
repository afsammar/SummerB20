package day27.array;
import java.util.Scanner;
import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        String[] names={"Alia","nur","Ahmed"};
        System.out.println(names[2]);
        System.out.println("===============================");
        for(int i=0; i<=names.length-1; i++){
            //if(names[i].charAt(0)!='A'){
              if(!names[i].startsWith("A")){
                continue;
            }
            System.out.println(names[i]);
        }
        System.out.println("===================================");
        int[] numbers=new int[5];
        System.out.println(numbers);
        numbers[3]=25;
        numbers[0]=100;
        numbers[3]=300;
        System.out.println(Arrays.toString(numbers));
        System.out.println("=====================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter?");
        String[] students = new String[scan.nextInt()];

scan.nextLine();
        for(int i= 0; i<=students.length-1; i++){
            System.out.println("Enter a name");
            students[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(students));

    }
}
