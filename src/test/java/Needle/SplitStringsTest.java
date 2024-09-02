package Needle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitStringsTest {
    //    @Test
//    public void testEvenString() {
//        String s = "abcdef";
//        String s1 = "HelloWorld";
//        assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(SplitStrings.solution(s)));
//        assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(SplitStrings.solution(s1)));
//    }
//
//    @Test
//    public void testOddString() {
//        String s = "abcde";
//        String s1 = "LovePizza";
//        assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(SplitStrings.solution(s)));
//        assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(SplitStrings.solution(s1)));
//    }
    @Test
    public void Needle() {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 5, 4, 3, 4, 5, 6, 67, 5, 5, 3, 3, 4, 2, 34, 234, 23, 4, 234, 324, 324, "needle", 1, 2, 3, 4, 5, 5, 6, 5, 4, 32, 3, 45, 54};
        assertEquals("found the needle at position 3", SplitStrings.findNeedle(haystack1));
        assertEquals("found the needle at position 5", SplitStrings.findNeedle(haystack2));
        assertEquals("found the needle at position 30", SplitStrings.findNeedle(haystack3));
    }

    @Test
    public void doNotCompareStringsWithEqualOperator() {
        Object[] haystack = {"junk", "more junk", new String("needle"), "gadget"};
        assertEquals("found the needle at position 2", SplitStrings.findNeedle(haystack));
    }
}
