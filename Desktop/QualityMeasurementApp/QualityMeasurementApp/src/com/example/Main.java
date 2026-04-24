public class Main {
    public static void main(String[] args) {

        // UC1
        System.out.println("Feet equality: " +
                QuantityMeasurementApp.compareFeet(5, 5));

        // UC2 - Inch
        System.out.println("Inch equality: " +
                QuantityMeasurementApp.compareInch(12, 12));

        // UC2 - Feet vs Inch
        System.out.println("Feet to Inch equality: " +
                QuantityMeasurementApp.compareFeetAndInch(1, 12));
    }
}