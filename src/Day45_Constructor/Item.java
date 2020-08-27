package Day45_Constructor;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double UnitPrice, int quantity){
        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
    }

    public double calcCost(){

        return quantity*unitPrice;
    }

    public String toString(){
        return "Name: "+name+", Unit Price: "+unitPrice+", Quantity: "+quantity+", Total Price: "+calcCost();
    }
}
