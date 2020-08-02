package Day19_Forloop;

public class continueStatement {
    public static void main(String[] args) {

        for(int i =1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.print(i+" ");

        }

        System.out.println();
        for(int a =1; a<50; a+=1){
            if(a%2==0){
                continue;
            }
            System.out.print(a+" ");
        }
    }
}
