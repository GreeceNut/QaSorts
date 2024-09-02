package ConvertStringToArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToArrayTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, StringToArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, StringToArray.stringToArray("I love arrays they are my favorite"));
    }

    @Test
    public void testSomething() {
        assertEquals("10 + 2", StringToArray.expandedForm(12));
        assertEquals("40 + 2", StringToArray.expandedForm(42));
        assertEquals("70000 + 300 + 4", StringToArray.expandedForm(70304));
    }

}