import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {

        // Step 1: Ask the user to enter the price
        // Step 2: Read the input as a double
        // Step 3: If price >= 100, shipping is 0
        // Step 4: Else, shipping is 2% of price
        // Step 5: Add shipping to price and display total

        Scanner in = new Scanner(System.in);
        double price = 0;
        double shipping = 0;
        double total = 0;

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine(); // clear buffer

            if (price >= 100) {
                shipping = 0;
            } else {
                shipping = price * 0.02;
            }

            total = price + shipping;
            System.out.println("Shipping cost: $" + shipping);
            System.out.println("Total cost: $" + total);

        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);

}if (in.hasNextDouble()) {
price = in.nextDouble();
    in.nextLine(); // clear buffer

    if (price >= 100) {
shipping = 0;
        } else {
shipping = price * 0.02;
        }

total = price + shipping;
    System.out.println("Shipping cost: $" + shipping);
    System.out.println("Total cost: $" + total);

} else {
String trash = in.nextLine();
    System.out.println("Invalid input: " + trash);
}
    }
}