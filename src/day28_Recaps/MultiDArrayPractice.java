package day28_Recaps;

import java.util.Arrays;

public class MultiDArrayPractice {
    public static void main(String[] args) {

        String[] group33 = {"Davut","Dilara","Nurmamet","Nurbiye","Pavlo","Julaiti","Virginia","Zain","Ali","Etnick","Aigul","Mike","Veola"};
        String[] group22 = {"Aiperi","Aalia","Rumiya","Viorel", "Samir"};
        String[] group2 = { "Ali", "Anton", "Elif", "Filip", "Guljannat" };
        String [] group21 = {"Violeta","Alla", "Adam", "Lilia"};
        String [] group17 =  {"Elvira", "Zeliha", "Paban","Asylkan", "Dilyar", "Roza","Kamil", "Sedge"};
    String [][] batch20={group33,group22,group2,group21,group17};
    for (int i = 0; i<=batch20.length-1; i++){
        String eachgroup[] =batch20[i];
       // System.out.println(Arrays.toString(eachgroup));
    for(int j=0; j<= eachgroup.length-1; j++){
        String eachelement=eachgroup[j];
        if(eachelement.toLowerCase().contains("m"))
        System.out.print(eachelement+" ");
    }
        System.out.println();
    }

    }
}
