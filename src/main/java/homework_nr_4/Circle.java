package homework_nr_4;

public class Circle {

    int circleRadius;

    public Circle(int circleRadius) {
        this.circleRadius = circleRadius;
    }

    public static void main(String[] args) {

        int radius = 7;
        int radius2 = 6;

        System.out.print("area of a circle when radius is " + radius);
        System.out.println(" = " + calculateArea(radius));
        System.out.println("----------------");

        Circle AreaOfCircle = new Circle(radius2);
        System.out.println("Radius is : " + AreaOfCircle.circleRadius);
        System.out.println("----------------");

        Circle.calculateArea(radius2);
        System.out.println("area is : " + calculateArea(radius2));
    }

    public static float calculateArea(int radius) {
        return (float) Math.PI * radius * radius;
    }
}
