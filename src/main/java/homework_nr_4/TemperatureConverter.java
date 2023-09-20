package homework_nr_4;

public class TemperatureConverter {
    public static void main(String[] args) {

        toFahrenheit(10.0);
        toCelsius(50.0);

        System.out.println("----------------------");

        TemperatureConverter Converter2 = new TemperatureConverter();
        Converter2.toFahrenheit(17.0);
        Converter2.toCelsius(32.0);

    }

    public static void toFahrenheit(double inCelsius) {
        System.out.println(inCelsius + " градусов Цельсия = " + (inCelsius * 1.8 + 32) + " градусам Фаренгейта");
    }

    public static void toCelsius(double inFahrenheit) {
        System.out.println(inFahrenheit + " градусов Фаренгейта = " + ((inFahrenheit - 32) / 1.8) + " градусам Цельсия");
    }
}

