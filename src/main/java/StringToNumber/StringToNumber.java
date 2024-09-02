package StringToNumber;

public class StringToNumber {

    public static void main(String[] args) {
        String validString = "123";
        String invalidString = "123x";
        int number;

        try {
            number = Integer.parseInt(validString);
            System.out.println("Converted integer: " + number);

            number = Integer.parseInt(invalidString);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input");
        }
    }
}

