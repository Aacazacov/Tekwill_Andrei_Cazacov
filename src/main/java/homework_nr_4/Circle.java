package homework_nr_4;

public class Circle {

    static int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public static void main(String[] args) {

    Circle C1 = new Circle(radius);

    C1.calculateArea(7);

    System.out.println("----------------");

    C1.calculateArea(6);
    }
    public static void calculateArea(int radius) {
        System.out.println("area of a circle when radius is " + radius + " = " + (Math.PI * radius * radius));
    }
}
