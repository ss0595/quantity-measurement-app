public class Quantity {

    private double value;
    private Unit unit;

    public Quantity(double value, Unit unit) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }
        this.value = value;
        this.unit = unit;
    }

    public double toBase() {
        return unit.toBase(value); // convert to inches
    }

    public boolean equals(Quantity other) {
        return Double.compare(this.toBase(), other.toBase()) == 0;
    }
}