public class ShopCart {
    public static void main(String[] args){
        // declare and instantiate a Shirt object using an Item reference type
        Shirt polo = new Shirt(22.44, 'M', 'W');
        Shirt vneck = new Shirt(34.65, 'L', 'b');
        Shirt teen = new Shirt(15.30, 'S', 'Y');
        // call the display method on the object, then the getColor method
        polo.display();
        vneck.display();
        teen.display();
    }
}
