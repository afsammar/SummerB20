package day20_while_loop;

public class branchingStatements {
    public static void main(String[] args) {


        char ch = 'A';
        while(ch <='E'){
            if(ch=='C'){
                ch++;
                continue;
            }else{
            System.out.println(ch);
            ch++;
        }}
    }
}
