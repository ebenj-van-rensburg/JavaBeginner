public class Shirt extends Item {
    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    // Override display() in the superclass to also show size and colorCode.

    @Override
    public void display() {
        super.display();
        System.out.println(
                "\tSize: "+getSize()
                +"\n\tColor: "+getColorCode()
        );
    }
    public char getSize() {
        return size;
    }
    public void setSize(char size) {
        this.size = size;
    }
    public char getColorCode() {
        return colorCode;
    }
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
}
