package day23;

public class Array_practice {
    public static void main(String[] args) {
        String [] students={"Cybertek","Muhtar","Nadir","Asiya"};
        String name1 = students[1];
        System.out.println(name1);

        int[]scores={85,70,95,100};
        String []names={"mike","Adam","Tony","John","Amy"};

        //System.out.println(names[0]+" : "+scores[0]);
       /* for(int i = 0; i<=4; i++){
            System.out.println(names[i]+" : "+scores[i]);
        }*/
        String[]classMates = new String[5];
        classMates[0]="Fatih";
        classMates[2]="Hazel";
        classMates[1]="Viorel";
        classMates[3]="Elkem";
        classMates[4]="Ahmed";

        for (int i =0; i<=classMates.length-1; i++){
            System.out.println(classMates[i]);
        }

    }
}
