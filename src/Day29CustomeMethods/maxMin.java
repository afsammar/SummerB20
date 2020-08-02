package Day29CustomeMethods;

public class maxMin {
    public static void main(String[] args) {
       int numbers[]={1,2,3,4,5,6};
        maxNum(numbers);
        minNum(numbers);
    }


    public static void maxNum(int[]arr){

        int max = arr[0];
        for (int each :arr) {
            if(each>max){
                max=each;
            }

        }
        System.out.println("max: "+max);
    }
    public static void minNum(int[]arr){

        int min = arr[0];
        for (int each :arr) {
            if(each<min){
                min=each;
            }

        }
        System.out.println("min: "+min);
    }
}
