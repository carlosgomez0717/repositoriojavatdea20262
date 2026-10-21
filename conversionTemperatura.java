public class conversionTemperatura {
    public static void main(String[] args) {
        double celsius = 36.6;
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%.1f °C = %.1f °F = %.2f K%n",
                         celsius, fahrenheit, kelvin);
    }
}
