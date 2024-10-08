public class Shirt extends Item {
    private char size;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price, colorCode);
        setSize(size);
    }
    // Override display() in the superclass to also show size and colorCode.
    @Override
    public void display() {
        super.display();
        System.out.println("\tSize: "+getSize());
    }
    public char getSize() {
        return size;
    }
    public void setSize(char size) {
        this.size = size;
    }
}
