package replitpractises;
import java.util.Scanner;
public class add_to_array156 {
    public  static void add_to_r(int[] r, int n){
       int [] new_r = new int [r.length+1];

       for(int i =0; i<r.length; i++){
           new_r[i] = r[i];
       }
    new_r[new_r.length-1]=n;
        for (int each:new_r) {
            System.out.println(each);

        }
    }
}
