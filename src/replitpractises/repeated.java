package replitpractises;

import java.util.Arrays;
import java.util.Scanner;
public class repeated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        Arrays.sort(nums);

        int result=0;
        for(int i=0; i<=nums.length-1;i++){
         int a =nums[i];
         if(nums[i]==result){
             continue;
         }else{
             result+=a;
         }


        }

        System.out.println(result);


    }
}
