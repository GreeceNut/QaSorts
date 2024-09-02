package SumOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDigitsTest {
    @Test
    public void Test1() {
        assertEquals(7, SumOfDigits.digital_root(16));
    }

    @Test
    public void Test2() {
        assertEquals(6, SumOfDigits.digital_root(456));
    }

    @Test
    public void Test3() {
        assertEquals(6, SumOfDigits.digital_root(123));
    }

    @Test
    public void Test4() {
        assertEquals(4, SumOfDigits.digital_root(0103));
    }

    @Test
    public void TestB1() {
        assertEquals(7, SumOfDigits.digital_root2(16));
    }

    @Test
    public void TestB2() {
        assertEquals(6, SumOfDigits.digital_root2(456));
    }

    @Test
    public void TestB3() {
        assertEquals(6, SumOfDigits.digital_root2(123));
    }

    @Test
    public void TestB4() {
        assertEquals(4, SumOfDigits.digital_root2(0103));
    }
}