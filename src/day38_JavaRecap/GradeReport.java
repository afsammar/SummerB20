package day38_JavaRecap;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(100,90,85,75,55,45,73,73,35,47,60,87,77,67,57,47,93,83,73,63,53,43));

        System.out.println(list);
        ArrayList<Integer>gradeA = new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf(each -> each<90);

        System.out.println("Grade A: "+gradeA);

        ArrayList<Integer>gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf(P -> P<80||P>89);

        System.out.println("Grade B: "+gradeB);

        ArrayList<Integer>gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(P -> P<70||P>79);

        System.out.println("Grade C: "+gradeC);

        ArrayList<Integer>gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(P -> P<60||P>69);

        System.out.println("Grade D: "+gradeD);

        ArrayList<Integer>gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(P -> P>59);

        System.out.println("Grade F: "+gradeF);

    }
}
