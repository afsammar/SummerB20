package Day19_Forloop;

import javax.swing.*;

public class sumOfEvenOdd {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i + " ");
        }

        int sumofodd = 0;
        for (int i = 0; i<=100; i+=2){
            sumofodd+=i;
            System.out.println(sumofodd);

        }

    }
}
