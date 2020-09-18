package day51_exceptions;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        String exceptionResult = "";

        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException e){
        exceptionResult= e.getMessage();
            System.out.println("ArithmeticExceeption is detected");
        }
        System.out.println(exceptionResult);

    }
}
