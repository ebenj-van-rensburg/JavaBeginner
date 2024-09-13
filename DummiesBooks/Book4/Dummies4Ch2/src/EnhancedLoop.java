public class EnhancedLoop {
    public static void main(String[] args) {
        String[] days = getDaysOfWeek();

        printStringArray(days);
    }

    public static void printStringArray(String[] strings) {
        for (String s : strings)
            System.out.println(s);
    }

    public static String[] getDaysOfWeek() {
        return new String[] { "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday",
                "Friday", "Saturday" };
    }
}
