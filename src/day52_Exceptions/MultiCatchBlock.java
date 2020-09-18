package day52_Exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {

        int[] arr = {10, 20};
        try {
            System.out.println(arr[20]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetich exception iss handled");
        } catch (ClassCastException e) {
            System.out.println("Class Cast exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound exception");

        }
        System.out.println("======================================");
        String str = "Cybertek";
        try{
            System.out.println(str.charAt(200));
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("Completed");
    }}
