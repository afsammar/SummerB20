package replitpractises;

public class AddElements {
    public static int[] addElements(int[] ints1,int [] ints2){
        int [] arr=new int[5];
        for(int i =0; i<=arr.length-1; i++){
            arr[i]=ints1[i]+ints2[i];
        }
        return arr;
    }
}
