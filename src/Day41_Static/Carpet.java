package Day41_Static;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean IsPersian;

    public void customOrder(double width,double length, double unitPrice, boolean IsPersian ){

        this.width=width;
        this.length= length;
        this.unitPrice=unitPrice;
        this.IsPersian=IsPersian;
    }
    public double calcCost() {
        double totalPrice = (width * length) * unitPrice;
        if(IsPersian){
            totalPrice+=200;
        }
    return totalPrice;
    }
        public void getCarpetInfo(){
            System.out.println("==================================");
        System.out.println("Carpet width: "+width);
            System.out.println("Carpet length: "+length);
            System.out.println("Carpet unit price"+ unitPrice);
            System.out.println("Carpet is persian carpet: "+IsPersian);
            System.out.println(("Total Price: "+calcCost()));
            System.out.println("==================================");
        }
    }



