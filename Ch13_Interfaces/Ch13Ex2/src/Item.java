public class Item {
    private int id;
    private String desc;
    private double price;
    private char colorCode;
    static int nextId = 1;
    // Default constructor sets default values
    public Item(){
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
        setColorCode('U');
    }
    // Overloaded constructor takes description and price
    public Item(String desc, double price, char cCode) {
        setId();
        setDesc(desc);
        setPrice(price);
        setColorCode(cCode);
    }
    // Default display method, prints to console
    public void display(){
        System.out.println("Item description: "+getDesc()
        +"\n\tID: "+getId()
        +"\n\tPrice: "+getPrice());
    }
    // Getter and Setter methods
    private void setId() {
        id = Item.nextId++;
    }
    public int getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    private void setDesc(String desc) {
        this.desc = desc;
    }
    public double getPrice() {
        return price;
    }
    private void setPrice(double price) {
        this.price = price;
    }
    public String getColorCode() {
        return switch (this.colorCode) {
            case 'b' -> "Black";
            case 'W' -> "White";
            case 'G' -> "Gray";
            case 'R' -> "Red";
            case 'Y' -> "Yellow";
            case 'B' -> "Blue";
            default -> null;
        };
    }
    public void setColorCode(char colorCode) { this.colorCode = colorCode;}
}
