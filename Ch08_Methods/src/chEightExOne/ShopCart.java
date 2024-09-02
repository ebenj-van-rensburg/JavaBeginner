package chEightExOne;

public class ShopCart {
    public static void main(String[] args){
        Item item1 = new Item();
        // Call the setColor method on item1. Print the new color value from
        // item1 if the method returns true. Otherwise, print an "invalid color" message.
        // Test the class, using both valid and invalid colors.
        char thisColor = ' ';
        if (!item1.setColor(thisColor)) {
            System.out.println("Invalid color");
        } else {
            System.out.println(item1.color);
        }
    }
}
