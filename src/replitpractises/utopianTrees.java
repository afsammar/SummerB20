package replitpractises;

public class utopianTrees {
    public static void main(String[] args) {
        int treesize =0;
        int growth=1;
        int growths=2;
        for (int i=1; i<=3; i++){
            treesize+=growth;
            System.out.println("year "+ i +"- growth "+growth+" cm");
            System.out.println("tree size: "+ treesize+" cm");
        }
        for (int i=1; i<=3; i++) {
            treesize += growths;
            System.out.println("year " + i + "- growth " + growths + " cm");
            System.out.println("tree size: " + treesize + " cm");
        }
    }
}
