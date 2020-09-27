package day55_Abstraction.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Cylinder cylinder1 = new Cylinder(3,5);
        Rectangle rectangle1 = new Rectangle(4,6);

        System.out.println(circle1.area);
        System.out.println(circle1);
        System.out.println(cylinder1.perimeter);
        System.out.println(cylinder1.hasVolume);
        System.out.println(rectangle1);
    }
}
