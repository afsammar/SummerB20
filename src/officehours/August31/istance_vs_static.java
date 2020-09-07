package officehours.August31;

public class istance_vs_static {
    int insVariable;
    static int staticVaraible;

    public static void main(String[] args) {
        System.out.println(staticVaraible);//static only
        System.out.println(istance_vs_static.staticVaraible);
        //System.out.println(insVariable);

        istance_vs_static obj = new istance_vs_static();
        System.out.println(obj.insVariable);

        System.out.println("=====================================================");
        System.out.println(obj.insVariable);
        System.out.println(obj.staticVaraible);
    }
    public void method1(){
        System.out.println(insVariable);
        System.out.println(staticVaraible);
    }

}
