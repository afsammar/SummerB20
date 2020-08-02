package day27.array;

public class foreachloop {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        for (int each : arr) {
            System.out.print(each+" ");
        }
        System.out.println();
for (int i = arr.length-1; i>=0; i--){
    System.out.print(arr[i]+" ");
}

        System.out.println();

int[] scores={10,20,30,40,50,60,70,80,90,100,110};
for(int each:scores){
    if(each%3!=0){
    continue;
    }
    System.out.print(each+" ");

    }
        System.out.println();
String[] names = {"AB","ABC","A","AB","ABCD"};
for (String each:names){
    if(!each.contains("C")){
    continue;
}
    System.out.println(each);
}


    }}
