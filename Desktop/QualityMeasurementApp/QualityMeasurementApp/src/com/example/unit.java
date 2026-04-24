public enum Unit {
    FEET(12.0),
    INCH(1.0);

    private final double toBaseFactor;

    Unit(double factor) {
        this.toBaseFactor = factor;
    }

    public double toBase(double value) {
        return value * toBaseFactor;
    }
}