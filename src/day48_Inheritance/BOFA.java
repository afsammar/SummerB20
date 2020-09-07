package day48_Inheritance;

public class BOFA {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("RAmazan","Alic");
        obj.setAccountHolder((obj.firstName+" "+obj.lastName));
        obj.setAccountNumber(1234567899);
        obj.setBalance(50);

        obj.avaliableBalance();
        obj.deposit(500);
        obj.avaliableBalance();

        obj.withdraw(700);

        obj.withdraw(-200);
        obj.withdraw(0);
        obj.withdraw(300);
        obj.deposit(1000000);
        System.out.println(obj);
    }
}
