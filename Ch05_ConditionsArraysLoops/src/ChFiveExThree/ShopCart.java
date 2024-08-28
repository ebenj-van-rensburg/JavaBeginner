package ChFiveExThree;

public class ShopCart {
    public static void main(String[] args) {
        // local variables
        String custName = "Eben";
        String message;

        String itemList[];
        itemList = new String[4];
        itemList[0] = "Sword";
        itemList[1] = "Dagger";
        itemList[2] = "Shield";
        itemList[3] = "Pauldron";

        message = custName + " wants to buy " + itemList.length + " items";
        System.out.println(message);
        // Iterate through and print out the items from the items array
        for (String item : itemList) {
            System.out.println("Item purchased: " + item);
        }
    }
}
