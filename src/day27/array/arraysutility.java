package day27.array;
import java.util.Arrays;
public class arraysutility {
    public static void main(String[] args) {
        String[] names = {"odina","liliia","berk","emine"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        int[] scores={10,20,30,40,50,60,70,80,90,100,110};
        System.out.println("Max: "+ scores[scores.length-1]);
        System.out.println("Min: "+ scores[0]);
        String[] s1={"A", "C","B"};
        String[] s2= {"B","A","C"};
        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(Arrays.equals(s1,s2));
        String w1 =Arrays.toString(s1);
        System.out.println(w1);
    }
}
