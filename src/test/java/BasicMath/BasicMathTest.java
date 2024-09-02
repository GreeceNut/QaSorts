package BasicMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicMathTest {

    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertEquals(11, BasicMath.basicMath("+", 4, 7));
        assertEquals(-3, BasicMath.basicMath("-", 15, 18));
        assertEquals(25, BasicMath.basicMath("*", 5, 5));
        assertEquals(7, BasicMath.basicMath("/", 49, 7));
    }

    @Test
    public void testBasicsB() {
        System.out.println("Basic Tests");
        assertEquals(11, BasicMath.basicMath2("+", 4, 7));
        assertEquals(-3, BasicMath.basicMath2("-", 15, 18));
        assertEquals(25, BasicMath.basicMath2("*", 5, 5));
        assertEquals(7, BasicMath.basicMath2("/", 49, 7));
    }

    @Test
    public void test1() {
        assertEquals(25, BasicMath.paperWork(5, 5));
        assertEquals(0, BasicMath.paperWork(5, -5));
        assertEquals(0, BasicMath.paperWork(-5, -5));
        assertEquals(0, BasicMath.paperWork(-5, 5));
        assertEquals(0, BasicMath.paperWork(5, 0));
        assertEquals(0, BasicMath.paperWork(5, -5));
    }

}