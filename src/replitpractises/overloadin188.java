package replitpractises;

public class overloadin188 {
    public static void main(String[] args) {

    }
    public static int findMax (int [] arr){
        int max =arr[0];
        for (int each : arr){
            if(each >max){
            max=each;
        }}
        return max;
    }
    public static double findMax (double [] arr){
        double max = arr[0];
        for(double each : arr){
            if (each >max){
            max=each;
        }}
    return max;
    }

}
