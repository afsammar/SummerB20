package Day19_Forloop;

public class odd_even {
    public static void main(String[] args) {


        for(int i = 0 ; i <= 100; i+=2){
            if(i % 2!=0 && i %3==0){
                if(i % 5==0 && i %3==0){
                    System.out.println(i+ " ");
                }
            }
        }


    }
}
