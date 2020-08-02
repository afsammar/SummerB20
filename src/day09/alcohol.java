package day09;

public class alcohol {
    public static void main(String[] args) {

        boolean hasID = true;
        int age = 19;
        boolean eligiable = hasID && age >= 21;
         String result = "";
        if (eligiable) {
            result = ("Eligiable to buy alcohol");
        }
        if(eligiable ){
            result =("Not Eligiable to buy alcohol");
            System.out.println(result);
        }


    }

}
