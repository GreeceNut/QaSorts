package ConvertStringToArray;

/**
 * Write a function to split a string and convert it into an array of words.
 *
 * Examples (Input ==> Output):
 * "Robin Singh" ==> ["Robin", "Singh"]
 *
 * "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class StringToArray {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }


    /**
     Write Number in Expanded Form
     You will be given a number and you will need to return it as a string in Expanded Form.
     For example:

     Kata.expandedForm(12); # Should return "10 + 2"
     Kata.expandedForm(42); # Should return "40 + 2"
     Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
     NOTE: All numbers will be whole numbers greater than 0.
     */
    public static String expandedForm(int num)
    {
        StringBuilder prikol = new StringBuilder();
        int mul = 1;
        while (num > 0){
            int a = num % 10;
            if (a > 0){
             int i = a * mul;
              if (prikol.length() > 0){
                  prikol.insert(0, " + ");
              }
              prikol.insert(0,i);
            }
            num /= 10;
            mul *= 10;
        }
       return prikol.toString();
    }

}
