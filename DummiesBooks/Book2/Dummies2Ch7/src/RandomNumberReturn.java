public class RandomNumberReturn {

    public static void main(String[] args) {
        getRandomNumber();
    }

    public static int getRandomNumber() {
        int num;
        while (true) {
            num = (int)(Math.random() * 20) + 1;
            if (num != 12) {
                System.out.println(num);
                return num;
            }
        }
    }
}
