package replitpractises;
import java.util.*;
public class uniques159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);

    }
public static void printUniqueNumbers (int []nums) {

    for (int i = 0; i <= nums.length - 1; i++) {
        boolean isUnique = true;
        for (int x = 0; x <= nums.length - 1; x++) {
            if (i != x && nums[i] == nums[x]) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            System.out.println(nums[i]);

        }
    }
}
}

