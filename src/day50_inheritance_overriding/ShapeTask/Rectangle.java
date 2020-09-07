package day50_inheritance_overriding.ShapeTask;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculaterPerimeter();
    }

    public double calculateArea(){
        return width*length;
    }
    public double calculaterPerimeter(){
        return (width + length)*2;
    }
}
