package StringRepeat;

/**
 * Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
 * Examples (input -> output)
 * 6, "I"     -> "IIIIII"
 * 5, "Hello" -> "HelloHelloHelloHelloHello"
 */

public class StringRepeat {

    public static String repeatStr(final int repeat, final String string) {
        if (repeat == 0 || string.isEmpty()) {
            return "";
        }
        String prikol = "";
        for (int i = 0; i < repeat; i++) {
            prikol += string;
        }
        return prikol;
    }

    static String repeatStr2(int repeat, String string) {
        return string.repeat(repeat);
    }

    public static String repeatStr3(final int repeat, final String string) {
        if (repeat == 0 || string.isEmpty()) {
            return "";
        }
        StringBuilder prikol = new StringBuilder();
        prikol.append(string.repeat(Math.max(0, repeat)));
        return prikol.toString();
    }

}
