package ReturningEverything;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturningStringsTest {

    @Test
    public void testStrings() {
        assertEquals("Hello, Ryan how are you doing today?", ReturningStrings.greet("Ryan"));
    }

    @Test
    public void testInts() {
        assertEquals("Здарова, тебе 5", ReturningStrings.number(5));
    }

    @Test
    public void testFloats() {
        assertEquals("Здарова, средний балл 4,50", ReturningStrings.doubler(4.5f));
    }
}