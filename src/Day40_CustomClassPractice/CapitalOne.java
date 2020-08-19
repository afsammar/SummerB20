package Day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {


        BankAccount Beslan = new BankAccount();
        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Waqar = new BankAccount();

        Beslan.setAccountinfo("Checking","Beslan","123456",0);
        Ahmet.setAccountinfo("Checking","Ahmet","123456",0);
        Viorel.setAccountinfo("Checking","Viorel","123456",0);
        Nurmamet.setAccountinfo("Checking","Nurmamet","123456",0);
        Waqar.setAccountinfo("Checking","Waqar","123456",0);

        ArrayList<BankAccount>accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan,Ahmet,Viorel,Nurmamet,Waqar));

        for (BankAccount each:accounts) {
            /*each.deposit(500);
            each.getAccountInfo();*/

        }
        accounts.get(3).deposit(500);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(400);
        accounts.get(3).checkBalance();
        System.out.println("===============================");
        accounts.removeIf(each->each.Balance<1000);
        for(BankAccount each : accounts){
            each.getAccountInfo();
        }

    }
}
