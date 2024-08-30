package chSixExTwo;

public class ShopCart {
    public static void main(String[] args) {
//      Declare and initialize 2 Item objects
        Item sword = new Item();
        Item shield = new Item();
        sword.desc = "Sword";
        shield.desc = "Shield";
//      Print both item descriptions and run code.
        System.out.println(sword.desc + "\n" + shield.desc + "\n");
//      optional: Assign one item to another and run it again.
        sword = shield;
        System.out.println("optional: \n" + sword.desc + "\n" + shield.desc);
    }
}