package ChFiveExOne;

public class ShopCart {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName = "Eben";
        String itemDesc = "Sword";
        String message;

        // Declare and initialize numeric fields: price, tax, quantity, and total.
        double price = 535.98;
        double tax = 15;
        int quantity = 2;
        double total;
        // Assign the message variable
        message = custName + " wants to buy " + quantity + " " + itemDesc;
        // Calculate total and then print the total cost
        total = (((tax / 100) * price) + price) * quantity;
        // Declare outOfStock variable and initialize it
        boolean outOfStock = quantity < 1;
        // Test quantity and modify message if quantity > 1
        if (outOfStock) {
            System.out.println(itemDesc + " is out of stock");
        } else {
            if (quantity > 1) {
                message = message + "s";
            }
            System.out.println(message);
            System.out.println("The total price is $" + total);
            System.out.println(itemDesc + " has " + quantity + " stock");
        }
    }
}