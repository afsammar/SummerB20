package day26;

import java.util.Arrays;

public class    multidpractice {
    public static void main(String[] args) {
        String[] testers = {"lili", "odina", "Cristina", "Elkem"};
        String[] devs = {"Ahmet", "erfan", "roza", "Sarah"};
        String[] SM ={"Nuemamet"};
        String[] PO ={"Nadir"};
        String[] BA ={"Alex"};
        String [][]scrumteam = {testers, devs, SM, PO, BA};
        scrumteam[4][0] = "Adam";
        scrumteam[1][2] = "Emina";
        System.out.println(Arrays.deepToString(scrumteam));
        for(String[] each:scrumteam) {
            for (String name : each) {
                System.out.print(name+" ");
            }
        }
        int[][] scores={{10,20,30,45},{60,55,75,105},{93,48,125,135}};
        for(int[] each : scores){
            for(int eachelement:each)
           if(eachelement%3==0 || eachelement%5==0){
            System.out.print((eachelement+" "));
        }}
        System.out.println();
        int[][] a1 ={{1,2}, {3,4,5}};
        int[][] a2 ={{6,7}, {8,9,10}};

        int[][][] arr3d ={{ {1,2}, {3,4,5} }, { {6,7}, {8,9,10} },};
    }
}
