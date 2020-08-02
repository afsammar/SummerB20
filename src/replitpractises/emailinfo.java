package replitpractises;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;
public class emailinfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String email = scan.nextLine();
        int frist = email.indexOf('_');
        int last= email.indexOf('@');
        int last2=email.indexOf('.');
        int length=email.length();
        String firstlet=email.substring(0,1);
        String firstlett=firstlet.toUpperCase();
        String lastnam=email.substring(frist+1,frist+2);
        String lastnamm=lastnam.toUpperCase();
        System.out.println("First name: "+firstlett+email.substring(1,frist));
        System.out.println("Last name: "+lastnamm+email.substring(frist+2,last));
        System.out.println("Domain: "+email.substring(last+1,last2));
        System.out.println("Top-Level Domain: "+email.substring(last2+1,length));
    }
}
