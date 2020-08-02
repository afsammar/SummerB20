package Day19_Forloop;

public class breakStatament {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <='H'; ch++){
            System.out.print(ch+" ");
            if(ch=='C'){
                break;
            }

        }

        System.out.println();
        for(int x = 1000; x>=100; x-=100){


        System.out.print(x+" ");
            if(x==500){
                break;
            }

        }


    }
}
