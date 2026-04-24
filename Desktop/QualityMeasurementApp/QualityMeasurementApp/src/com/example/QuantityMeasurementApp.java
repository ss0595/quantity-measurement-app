public class QuantityMeasurementApp {

    public static boolean compare(double v1, Unit u1, double v2, Unit u2) {
        Quantity q1 = new Quantity(v1, u1);
        Quantity q2 = new Quantity(v2, u2);
        return q1.equals(q2);
    }
}