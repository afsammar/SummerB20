package day11_nestedif_switch;

public class NestedIf {
    public static void main(String[] args) {


    int grade =99;
    String result = "invalid";

    if (grade >=0 && grade<=100 ){
        if(grade >=90){
            result ="A";
        }else if (grade >=80){
            result = "B";
        }else if (grade>=70){
            result = "C";
        }else if (grade >=60){
            result = "D";
        }else{
            result = "F";
        }
    }else{
        result = "invalid score entered";
    }
        System.out.println(result);
        System.out.println("==============================");

        /* precondition : minimum salary of 30k
        sub condition: minimum 2 years job history
        */
        double salary =32000;
        int jobhistory= 1;
        String r = "";
        if (salary > 30000){

        if (jobhistory>2){
            r="eligble";


        }else{
            r="not eligible due to job history";
        }

        }else{
            r="not elibigle due to salary";
        }
        System.out.println(r);







}}
