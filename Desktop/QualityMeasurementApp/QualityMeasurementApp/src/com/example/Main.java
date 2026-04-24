public class Main {
    public static void main(String[] args) {

        // UC1 (Feet)
        System.out.println("Feet equality: " +
                QuantityMeasurementApp.compare(5, Unit.FEET, 5, Unit.FEET));

        // UC2 (Inch)
        System.out.println("Inch equality: " +
                QuantityMeasurementApp.compare(12, Unit.INCH, 12, Unit.INCH));

        // UC2 (Feet vs Inch)
        System.out.println("Feet vs Inch: " +
                QuantityMeasurementApp.compare(1, Unit.FEET, 12, Unit.INCH));
    }
}