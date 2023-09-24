package homework_nr_4;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("area of a circle when radius is " + radius + " = " + (Math.PI * radius * radius));
    }
}
