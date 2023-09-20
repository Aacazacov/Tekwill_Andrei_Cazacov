package homework_nr_4;

public class main {
    public static void main(String[] args) {
        Circle circleArea = new Circle(6);
        circleArea.calculateArea();
        System.out.println("--------------------------");
        TemperatureConverter converter = new TemperatureConverter(0.0, 32.0);
        converter.toFahrenheit();
        converter.toCelsius();
    }
}
