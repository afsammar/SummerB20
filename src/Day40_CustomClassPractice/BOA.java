package Day40_CustomClassPractice;

public class BOA {
    public static void main(String[] args) {
        BankAccount Dawud =new BankAccount();
        Dawud.setAccountinfo("Saving","Dawud Afsin","123456",0);
        Dawud.getAccountInfo();
        Dawud.deposit(1000);
        Dawud.checkBalance();
        Dawud.withDraw(500);
        Dawud.checkBalance();
        Dawud.withDraw(100000);
        Dawud.checkBalance();
    }
}
