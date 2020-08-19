package Day40_CustomClassPractice;

public class BankAccount {
    String AccountType;
    String AccountHolder;
    String AccountNumber;
    double Balance;

    public void setAccountinfo(String actType, String actHolder, String actNmber,double actBalance){
        this.AccountType=actType;
        this.AccountHolder=actHolder;
        this.AccountNumber=actNmber;

    }
    public void getAccountInfo(){
        System.out.println("==============================");
        System.out.println("Account Holder: "+AccountHolder);
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Avaliable Balance: "+Balance);
        System.out.println("==============================");
    }
    public void checkBalance(){
        System.out.println("Avaliable Balance: "+Balance);
    }
    public void deposit (double amount){
        System.out.println("Depositing $"+amount+"to"+AccountNumber);
        Balance += amount;
    }
    public void withDraw(double amount){
        Balance-=amount;
        if(amount>Balance){
            System.out.println("not enough balance");
            return;
        }
        Balance-=amount;
    }

}
