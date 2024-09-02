package ReversedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedArrayTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, ReversedArray.digitize(35231));
        assertArrayEquals(new int[]{0}, ReversedArray.digitize(0));

    }

    @Test
    public void sampleTests() {
        assertEquals("dlrow", ReversedArray.reverse("world"));
    }

}
