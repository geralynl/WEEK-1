public class ShoppingCalculator {
    public static void main(String[] args) {
        int quantity = 3;
        double unitPrice = 49.50;
        String storeName = "ABC Store";

        // Use double because the total may have decimal values.
        double totalCost = quantity * unitPrice;

        System.out.println("Store: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
    }
}
