public class StatementsApp {
    public static void main(String[] args) {
        // declaration statements
        int i;
        String s = "This is a string";
        String t = "This is a string";

        // expression statement
        int a = 1;
        int b = 2;
        i = a + b;
        String stringStuff = s + " " + t;
        System.out.println(stringStuff);
        System.out.println(i);

        // if statements
        double total = i + b;
        double discountPercent;
        if (total > 100) {
            discountPercent = 10;
        }

        // whitespace
        int x = 1;
        int y = 2;
        int z = 3;
        x = (y + 5) / z;
        y =
                (x + 5) - z;
        z
                =
                (y - 5)
                        +
                        x;
        System.out.println(z);
    }
}
