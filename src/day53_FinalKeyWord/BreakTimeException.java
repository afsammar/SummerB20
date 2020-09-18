package day53_FinalKeyWord;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(){
        super("It is time for a break");
    }
    public BreakTimeException(String str){

    }



}
class Test{
    public static void main(String[] args) {
        //throw new RuntimeException("This is runtime exception");
        throw new BreakTimeException("you need to give us a break");

        //System.out.println("Test Completed");
    }
}

