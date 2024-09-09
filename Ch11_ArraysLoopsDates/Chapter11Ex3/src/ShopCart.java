import java.math.*;

public class ShopCart {
    Item[] items = {
            new Item("Shirt",25.60),
            new Item("WristBand",10.55),
            new Item("Pants",35.99)};

    public static void main(String[] args){
        ShopCart cart = new ShopCart();
        cart.displayTotal();
    }
    // Use a standard for loop to iterate through the items array, adding up the total price
    //    Skip any items that are back ordered.  Display the Shopping Cart total.
    public void displayTotal(){
        double total = 0;
        for (Item item : items){
            if (item.isBackOrdered()) {
                continue;
            } else {
                total += item.getPrice();
            }
        }
        System.out.println("Total price: " + Math.round(total * 100.0) / 100.0);
    }
}
