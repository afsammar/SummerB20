package replitpractises;
import java.util.Scanner;
public class countseven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    int even=0;
        for(int i =0; i<=nums.length-1; i++){
        if(nums[i]%2==0) {
            even += nums[i];
        }
        }
        System.out.println(even);
    }
}
