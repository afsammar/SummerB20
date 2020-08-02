package day32;

public class uniques {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,3};

        for (int element :arr) {
            int count = 0 ;

            for (int b:arr) {
                if (element == b) {
                    count++;

                }
            }
                if(count ==1){
                    System.out.println(element);
        /*int element = arr[0];
        int count = 0 ;

        for (int b:arr) {
            if(element==b){
                count++;*/

        }

    }

    }
public static void uniqueElements(int[] arr){
    for (int element :arr) {
        int count = 0 ;

        for (int b:arr) {
            if (element == b) {
                count++;

            }
        }
        if(count ==1){
            System.out.println(element);
}
        }
    }
}
