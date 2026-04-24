public enum Unit {
    FEET(12.0),          // 1 ft = 12 inches
    INCH(1.0),           // base unit
    YARD(36.0),          // 1 yard = 3 feet = 36 inches
    CM(0.393701);        // 1 cm = 0.393701 inches

    private final double toBaseFactor;

    Unit(double factor) {
        this.toBaseFactor = factor;
    }

    public double toBase(double value) {
        return value * toBaseFactor;
    }
}