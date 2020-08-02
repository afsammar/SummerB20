package day23;

public class maxAndmin {
    public static void main(String[] args) {
        int[] nums={5,5,4,6,4,1};
        int max = nums[0];
        for(int i = 1; i<=nums.length-1; i++){
            if(nums[i]>max){
                max=nums[i];
            }

        }
        System.out.println(max);
    }
}
