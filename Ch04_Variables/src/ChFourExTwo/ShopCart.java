package ChFourExTwo;

public class ShopCart {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName = "Eben";
        String itemDesc = "Sword";
        String message;
        // Assign the message variable
        message = custName + " wants to buy a " + itemDesc;
        // Declare and initialize numeric fields: price, tax, quantity, and total.
        double price = 163.98;
        double tax = 15;
        int quantity = 1;
        double total;
        // Modify message to include quantity
        message = message + ", just " + quantity;
        // Print and run the code
        System.out.println(message);
        // Calculate total and then print the total cost
        total = (((tax / 100) * price) + price) * quantity;
        System.out.println(total);
    }
}
