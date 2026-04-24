public class QuantityMeasurementApp {

    // UC1: Feet equality
    public static boolean compareFeet(double v1, double v2) {
        Feet f1 = new Feet(v1);
        Feet f2 = new Feet(v2);
        return f1.equals(f2);
    }

    // UC2: Inch equality
    public static boolean compareInch(double v1, double v2) {
        Inch i1 = new Inch(v1);
        Inch i2 = new Inch(v2);
        return i1.equals(i2);
    }

    // UC2: Feet to Inch comparison
    public static boolean compareFeetAndInch(double feet, double inch) {
        Feet f = new Feet(feet);
        Inch i = new Inch(inch);
        return Double.compare(f.toInches(), i.toInches()) == 0;
    }
}