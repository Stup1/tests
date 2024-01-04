import models.Order;

public class Main {
    public static void main(String[] args) {
        // Create T-shirt objects
        Tshirt tShirt1 = new Tshirt("T-shirt", 572, 1235, "Karuna",
                "You either die a hero or live long enough to see yourself be a villain", new String[]{"M", "L", "XL"});

        // Describe the T-shirt
        tShirt1.describeTshirt();

        // Create Order objects
        Order order1 = new Order("Gopal Sharma", "0486756465",
                new int[]{572, 681}, new double[]{1235, 1780});

        // Print the bill with VAT
        order1.printBillWithVAT();
    }
}
