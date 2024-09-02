package chEightExTwo;

public class ShopCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemDisplay("Sword", 1, 565.13);
        item1.displayItem();
        char color = ' ';
        // Call the 4-arg setItemFields method, checking the return value.
        // Test your code for both valid and invalid values
        if (item1.setItemDisplay(item1.desc, item1.quantity, item1.price, color) < 0) {
            System.out.println("Invalid Color");
        } else {
            item1.displayItem();
        }
    }
}
