package day47;

public class MyCreditentials {
    public static void main(String[] args) {


    ClassCreditentials obj = new ClassCreditentials("mike",34);
    obj.setUserName("Cybertek");
    obj.setPassWord("CyberTek12345");


        System.out.println(obj.getUserName());
        System.out.println(obj.getPassWord());
        System.out.println(obj.companyName);


    }
}
