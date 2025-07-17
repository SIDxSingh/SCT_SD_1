import java.util.Scanner;

public class TemperatureConverter {


    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }


    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Choose the input scale (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double c = scanner.nextDouble();
                System.out.printf("Fahrenheit: %.2f °F\n", celsiusToFahrenheit(c));
                System.out.printf("Kelvin: %.2f K\n", celsiusToKelvin(c));
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = scanner.nextDouble();
                System.out.printf("Celsius: %.2f °C\n", fahrenheitToCelsius(f));
                System.out.printf("Kelvin: %.2f K\n", fahrenheitToKelvin(f));
                break;

            case 3:
                System.out.print("Enter temperature in Kelvin: ");
                double k = scanner.nextDouble();
                System.out.printf("Celsius: %.2f °C\n", kelvinToCelsius(k));
                System.out.printf("Fahrenheit: %.2f °F\n", kelvinToFahrenheit(k));
                break;

            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        scanner.close();
    }
}
