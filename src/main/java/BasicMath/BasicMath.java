package BasicMath;

/**
 * Your task is to create a function that does four basic mathematical operations.
 * <p>
 * The function should take three arguments - operation(string/char), value1(number), value2(number).
 * The function should return result of numbers after applying the chosen operation.
 */

public class BasicMath {
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        if (op == "+") {
            result = v1 + v2;
        } else if (op == "-") {
            result = v1 - v2;
        } else if (op == "*") {
            result = v1 * v2;
        } else if (op == "/") {
            result = v1 / v2;
        }
        return result;

    }

    public static Integer basicMath2(String op, int v1, int v2) {
        switch (op) {
            case "-":
                return v1 - v2;
            case "+":
                return v1 + v2;
            case "*":
                return v1 * v2;
            case "/": {
                if (v2 == 0)
                    throw new IllegalArgumentException("Division by zero");
                return v1 / v2;
            }
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }

    /**
     * Your classmates asked you to copy some paperwork for them.
     * You know that there are 'n' classmates and the paperwork has 'm' pages.
     * Your task is to calculate how many blank pages do you need.
     * If n < 0 or m < 0 return 0.
     */
    public static int paperWork(int n, int m) {
        int paper = n * m;
        if (n < 0) {
            return 0;
        }
        return Math.max(paper, 0);
    }

    public static int paperWork1(int n, int m) {
        return (n < 0) || (m < 0) ? 0 : n * m;
    }


    public static int paperWork2(int n, int m) {
        return Math.max(m, 0) * Math.max(n, 0);
    }
}
