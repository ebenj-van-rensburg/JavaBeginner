public class ShopCart {
    public static void main(String[] args){
        Shirt polo = new Shirt(22.44, 'M', 'W');
        Shirt vneck = new Shirt(34.65, 'L', 'B');
        Shirt teen = new Shirt(15.30, 'S', 'Y');
        // instantiate a Shirt object and call display() on the object reference
        polo.display();
        vneck.display();
        teen.display();
    }
}
