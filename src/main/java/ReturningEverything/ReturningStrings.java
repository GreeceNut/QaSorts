package ReturningEverything;

public class ReturningStrings {

    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }

    public static String number(int n) {
        return String.format("Здарова, тебе %d", n);
    }

    public static String doubler(double d) {
        return String.format("Здарова, средний балл %.2f", d);
    }
}
