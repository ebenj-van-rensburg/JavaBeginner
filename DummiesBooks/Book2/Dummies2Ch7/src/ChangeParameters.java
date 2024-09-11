public class ChangeParameters {
    public static void main(String[] args) {
        int number = 1;
        tryToChangeNumber(number);
        System.out.println(number);
    }
    public static void tryToChangeNumber(int i) {
        i = 2;
    }
}