public enum unit {
    FEET(1.0),
    INCH(1.0 / 12.0);

    private final double toFeet;

    unit(double toFeet) {
        this.toFeet = toFeet;
    }

    public double toBase(double value) {
        return value * toFeet;
    }

    public double fromBase(double baseValue) {
        return baseValue / toFeet;
    }
}