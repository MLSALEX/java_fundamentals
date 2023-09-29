package homework_nr_4;

public class TemperatureConverter {
    public static void toCelsius(int tempF) {
        System.out.println((tempF - 32) / 1.8);
    }

    public static void toFahrenheit(int tempC) {
        System.out.println((tempC * 1.8) + 32);
    }

    public static void main(String[] args) {
        TemperatureConverter.toCelsius(32);
        TemperatureConverter.toFahrenheit(16);
    }
}
