package replitpractises;

import day26.nums;

public class RowSum {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int[] sums = rowSums(a);

        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }

    public static int [] rowSums(int[][]nums){
       int []sum = new int[4];
        for (int j = 0; j<=1;j++) {
            for(int i = 0; i<=nums[j].length-1;i++){
                sum[i]+=nums[j][i]+nums[j+1][i];

            }
        }
        return sum;
    }
}
