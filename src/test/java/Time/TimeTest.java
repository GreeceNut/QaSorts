package Time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
    @Test
    public void test1() {

        assertEquals(61000, Time.Past(0, 1, 1));
    }
}
