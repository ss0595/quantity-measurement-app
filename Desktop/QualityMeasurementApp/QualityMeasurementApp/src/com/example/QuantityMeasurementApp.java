public class QuantityMeasurementApp {

    // Method to check equality of two feet values
    public boolean areEqual(double value1, double value2) {
        return Double.compare(value1, value2) == 0;
    }

    // Optional: validation method
    public boolean isValid(double value) {
        return !Double.isNaN(value) && !Double.isInfinite(value);
    }
}