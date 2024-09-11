public class EnumTest {
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS};

    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.SPADES;
        System.out.println("The suit is " + suit);
        System.out.println("The value of CardSuit.HEARTS is " + CardSuit.HEARTS.toString());
    }
}
