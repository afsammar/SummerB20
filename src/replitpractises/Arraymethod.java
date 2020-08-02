package replitpractises;
import java.util.Scanner;
public class Arraymethod {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main
 public static void plus_minus(int [] arr){
int pos=0;
int neg=0;
int zer=0;
        for(int i = 0; i<=arr.length-1; i++){
    if(arr[i]<0){
        neg++;
    }else if(arr[i]==0){
        zer++;
    }else{
        pos++;
    }
}
     System.out.println("positives:"+pos+", negatives:"+neg+", zeros: "+zer);
 }
}

