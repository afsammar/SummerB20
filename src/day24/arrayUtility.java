package day24;
import java.util.Arrays;
public class arrayUtility {
    public static void main(String[] args) {
        int[]arr ={1,2,3};
        System.out.println(Arrays.toString(arr));
        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"muhtar", "Saim", "Nadir", "Asiya", "Kuzzat"};
        System.out.println(names);
        System.out.println(Arrays.toString(names));

        int[]nums = {5,4,6,5,4,3,10};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("max: "+nums[nums.length-1]);

        String students[]={"Mehdi","Elkem","Mee","Trump"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean r1 = Arrays.equals(arr1, arr2);
        System.out.println(r1);
        int [] arr3 = {2, 1, 3};
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        boolean r2 = Arrays.equals(arr2,arr3);
        System.out.println(r2);

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 =str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
       boolean result= Arrays.equals(ch1,ch2);
        System.out.println(result);


        String sentence = "I love programming language";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        for(int i = words.length-1; i>=0; i--) {
            System.out.print(words[i]+" ");
        }
    }
}
