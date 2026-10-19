public class UnitCastingConverter {
    public static void main(String[] args) {
        double centimeters = 175.5;

        int wholeMeters = (int) centimeters / 100;
        double remainingCm = centimeters - (wholeMeters * 100);

        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCm);

        int number = 50;
        double widenedNumber = number; // No cast needed because int widens to double.
        System.out.println("Implicit Widening: " + widenedNumber);

        double price = 99.75;
        int narrowedPrice = (int) price; // Decimal part .75 is lost.
        System.out.println("Explicit Narrowing: " + narrowedPrice);
    }
}
