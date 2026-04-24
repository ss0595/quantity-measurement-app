public class Quality {
    private double value;
    private unit unit;

    public Quality(double value, unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public unit getUnit() {
        return unit;
    }

    // ✅ UC6 METHOD
    public Quality add(Quality other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot add null");
        }

        // Convert both to base (feet)
        double thisInFeet = this.unit.toBase(this.value);
        double otherInFeet = other.unit.toBase(other.value);

        // Add
        double sum = thisInFeet + otherInFeet;

        // Convert back to unit of first operand
        double result = this.unit.fromBase(sum);

        return new Quality(result, this.unit);
    }
}