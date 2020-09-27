package day56_Abstraction.PhoneTask;

public final class Iphone extends Phone {
    public Iphone( String model, double price, String size) {
        super("Iphone", model, price, size);
        if(price<0 ||price>1500){
            throw new RuntimeException("Invalid price");
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);

    }

    @Override
    public void texting(long num1, long num2) {

        texting(num1);
        texting(num2);

    }

    @Override
    public void calling(long num1, long num2) {

    }

    public void faceTiming(long phoneNumber){
        System.out.println("Facetiming with"+ phoneNumber);

    }

    public void faceTiming(long num1,long num2){
        faceTiming(num1,num2);
    }
}
