package officehours;

public class Pizza {
    String size;
    int NumOfCheeseTopping;
    int NumOfPepperoniTopping;

    public void set(String size,int numOfCheeseTopping,int numOfPepperoniTopping){
        this.size=size;
        this.NumOfCheeseTopping=numOfCheeseTopping;
        this.NumOfPepperoniTopping=numOfPepperoniTopping;

    }

    public double calcCost(){
       int totalNumberOfTopping= NumOfCheeseTopping+NumOfPepperoniTopping;
       double totalPriceOfTop = totalNumberOfTopping*2;
       double totalPrice=totalPriceOfTop;
        if(size.equals("small")){
            totalPrice+=10;
        } else if(size.equals("medium")) {
            totalPrice+=12;
        }else{
            totalPrice+=12;
        }
        return totalPrice;
    }

    public String toString(){
        return "Size: "+size+"\nNumber of cheese topping : "+NumOfCheeseTopping+
                "\nNumber of pepperoni topping+"+"\nTotal price"+calcCost();
    }



}
