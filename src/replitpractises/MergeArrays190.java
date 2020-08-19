package replitpractises;

public class MergeArrays190 {
    public static int[] mergR(int[] a,int[] b) {
    int []arr =new int[a.length+b.length];
    for(int i =0; i<arr.length; i++){

        if(i<a.length){
            arr[i]=a[i];
        }else{
            arr[i]=b[i-a.length];
        }
    }
return arr;

    }//end mergR

    public static void main(String[] args)
    {

    }
}
