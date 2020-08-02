package day09;

public class medium {
    public static void main(String[] args) {

double a =100;
double b =200;
double c =300;

boolean mida = (a>b && a <c) || (a >c && a<b);
boolean midb = (b>a && b <c) || (b>c && b<a);
boolean midc = (!mida && !midb);

double med = 0;

if (mida){
    med =a;
}
if (midb){
    med =b;
}
if (midc){
    med=c;

}
        System.out.println(med + "is the medium number");
    }
}
