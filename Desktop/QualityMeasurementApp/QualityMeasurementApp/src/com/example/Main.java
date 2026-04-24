public class Main {
    public static void main(String[] args) {

        Quality length1 = new Quality(1, unit.FEET);
        Quality length2 = new Quality(12, unit.INCH);

        Quality result = length1.add(length2);

        System.out.println(result.getValue() + " " + result.getUnit());
        // Expected: 2.0 FEET
    }
}