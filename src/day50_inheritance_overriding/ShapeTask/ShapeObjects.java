package day50_inheritance_overriding.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {


        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculaterPerimeter());
        System.out.println(circle.calculatePerimeter());
    }
}
