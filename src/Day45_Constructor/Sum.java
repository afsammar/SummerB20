package Day45_Constructor;

public class Sum {
public Sum(int a , int b){
    System.out.println("Sum: "+(a+b) );
}
public Sum(double a , double b){
    System.out.println("Sum: "+(a+b));
}

    public static void main(String[] args) {
        new Sum(10,20);
    }
}
