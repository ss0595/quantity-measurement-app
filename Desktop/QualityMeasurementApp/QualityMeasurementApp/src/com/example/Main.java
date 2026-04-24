import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        QuantityMeasurementApp app = new QuantityMeasurementApp();

        try {
            System.out.print("Enter first value in feet: ");
            double value1 = scanner.nextDouble();

            System.out.print("Enter second value in feet: ");
            double value2 = scanner.nextDouble();

            // Validate input
            if (!app.isValid(value1) || !app.isValid(value2)) {
                System.out.println("Invalid input!");
                return;
            }

            // Compare values
            boolean result = app.areEqual(value1, value2);

            System.out.println("Are values equal? " + result);

        } catch (Exception e) {
            System.out.println("Please enter valid numeric values.");
        }

        scanner.close();
    }
}