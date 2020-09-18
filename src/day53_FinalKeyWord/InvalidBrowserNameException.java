package day53_FinalKeyWord;

public class InvalidBrowserNameException extends RuntimeException {
    public InvalidBrowserNameException(){
        super("invalid browser name");
    }
    public InvalidBrowserNameException(String str){
    super(str);
    }

}
class Test2{
    public static void main(String[] args) {
        String name = "cybertek";
        switch (name){
            case"chrome":
                System.out.println("Chrom is selecte");
                break;
            case"firefox":
                System.out.println("firefox is selected");
                break;
            case"safari":
                System.out.println("safari is selected");
                break;
            default:
                throw new InvalidBrowserNameException("please enter a valid browser name");
        }

        //throw new InvalidBrowserNameException();
    }

}
