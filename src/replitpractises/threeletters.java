package replitpractises;
import java.util.Scanner;
public class threeletters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

            for (int i = 0; i < 5; i++) {
                arr[i] = input.nextLine();
                if (arr[i].length() >= 3) {
                    System.out.println(arr[i].substring(0, 3));
                }

            }
        }

    }

