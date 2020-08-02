package Day29CustomeMethods;

public class EligibilityToVote {
    public static void eligibilityAlcohol(boolean hasid, int age){
       if (hasid &&age>=21){
           System.out.println("you are eligible to buy alcohol");
       }else{
           System.out.println("You are not eligible to buy alcohol");
       }
   }

    public static void main(String[] args) {

        vote("Ammar",19,true,"Ammar");
        eligibilityAlcohol(true,24);

    }


    public static void vote(String name,int age, boolean citizen,String presidentName){
         boolean eligibleToVote = age>=18 && citizen ==true;
         if(eligibleToVote){
             System.out.println(name+" is eligible to vote for "+presidentName);
         }else{
             System.out.println(name+" is not eligible to vote");
         }

    }
public static void calculator(double num1, char operator, double num2){
        switch(operator){
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
        }
}


}
