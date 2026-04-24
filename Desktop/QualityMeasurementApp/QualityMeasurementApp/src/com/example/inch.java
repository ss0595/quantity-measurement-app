public class Inch {
    private double value;

    public Inch(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Invalid inch value");
        }
        this.value = value;
    }

    public double toInches() {
        return value;
    }

    public boolean equals(Inch other) {
        return Double.compare(this.value, other.value) == 0;
    }
}