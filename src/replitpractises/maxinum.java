package replitpractises;
import java.util.Arrays;
import java.util.Scanner;
public class maxinum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int max = 0;
        for(int i =0; i<=nums.length-1; i++){
            if(nums[i]>max) {
                  max=nums[i];

            }

        }
        System.out.println(max);

    }
}
