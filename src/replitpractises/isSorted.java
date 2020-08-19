package replitpractises;

public class isSorted {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,5};
        System.out.println(isSort(arr));
    }



    public static boolean isSort(int[]nums){
        int result =0;
        boolean r=false;
        for(int i =0; i<=nums.length-1; i++){
            if(nums[i]<result){
                return r;

            }
        }
    return r;
    }
}
