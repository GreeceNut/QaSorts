package ConsecutiveStrings;

/**
 * You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 * <p>
 * Examples:
 * strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2
 * <p>
 * Concatenate the consecutive strings of strarr by 2, we get:
 * <p>
 * treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
 * folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
 * trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
 * blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
 * abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]
 * <p>
 * Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
 * The first that came is "folingtrashy" so
 * longest_consec(strarr, 2) should return "folingtrashy".
 * <p>
 * In the same way:
 * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "" (return Nothing in Elm, "nothing" in Erlang).
 * <p>
 * Note
 * consecutive strings : follow one after another without an interruption
 */
public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {

        if (strarr.length == 0 || k <= 0 || k >= strarr.length) {
            return "";
        }
        //Сначала вводим строку самую длинную строку longest
        String longest = "";
        // проходимся по массиву таким образом, чтобы у нас
        // было k элементов для объединения
        for (int i = 0; i <= strarr.length - k; i++) {
            //создаем временную строку для хранения
            StringBuilder tempStr = new StringBuilder();
            // объединяем вторым циклом k последовательных строк
            for (int j = 0; j < k; j++) {
                tempStr.append(strarr[j + i]);

                //Если текущая временная строка длиннее longest, то мы
                // присуждаем ее к longest
                if (tempStr.length() > longest.length()) {
                    longest = tempStr.toString();
                }
            }
        }
        return longest;
    }
}
