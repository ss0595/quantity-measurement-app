public class Main {
    public static void main(String[] args) {

        // UC1
        System.out.println("Feet equality: " +
                QuantityMeasurementApp.compare(5, Unit.FEET, 5, Unit.FEET));

        // UC2
        System.out.println("Feet vs Inch: " +
                QuantityMeasurementApp.compare(1, Unit.FEET, 12, Unit.INCH));

        // UC4 - Yard
        System.out.println("Yard vs Feet: " +
                QuantityMeasurementApp.compare(1, Unit.YARD, 3, Unit.FEET));

        // UC4 - CM
        System.out.println("CM vs Inch: " +
                QuantityMeasurementApp.compare(2.54, Unit.CM, 1, Unit.INCH));

        // Mixed check
        System.out.println("Yard vs CM: " +
                QuantityMeasurementApp.compare(1, Unit.YARD, 91.44, Unit.CM));
    }
}