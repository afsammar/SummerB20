package Day19_Forloop;

public class A_Z {
    public static void main(String[] args) {

        for(char ch = 'a'; ch<='z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();

        for(int i = 97; i<=122; i++) {
            char ch = (char) i;
            System.out.print(ch + " ");


        }
        System.out.println();
        System.out.println("==========");
        for(char ch ='Z'; ch>='A'; ch-- ){
            System.out.print(ch + " ");
        }
    for(int i = 0; i<65000; i++) {
        System.out.println((char) i + " ");
    }

    }
}
