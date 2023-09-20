package homework_nr_4;

public class TemperatureConverter {
    double inCelsius;
    double inFahrenheit;

    public TemperatureConverter(double inCelsius, double inFahrenheit) {
        this.inCelsius = inCelsius;
        this.inFahrenheit = inFahrenheit;
    }

    public void toFahrenheit() {
        System.out.println(inCelsius + " градусов Цельсия = " + (inCelsius * 1.8 + 32) + " градусам Фаренгейта");
    }

    public void toCelsius() {
        System.out.println(inFahrenheit + " градусов Фаренгейта = " + ((inFahrenheit - 32) / 1.8) + " градусам Цельсия");
    }
}


