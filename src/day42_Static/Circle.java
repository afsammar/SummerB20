package day42_Static;

public class Circle {
    double raidus;
    double diameter;
    static double pi=3.14;

    public void setInfo(double radius){
        this.raidus=radius;
        diameter =radius*2;
    }
    public double calcArea(){
        return  raidus*raidus*pi;
    }
public double calcPerimeter(){
        return diameter*pi;
}
public String toString(){
        return "the are of the circle with the radius of "+raidus+"is: "+calcArea();
}
}
