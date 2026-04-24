public class Feet {
    private double value;

    public Feet(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Invalid feet value");
        }
        this.value = value;
    }

    public double toInches() {
        return value * 12;
    }

    public boolean equals(Feet other) {
        return Double.compare(this.value, other.value) == 0;
    }
}