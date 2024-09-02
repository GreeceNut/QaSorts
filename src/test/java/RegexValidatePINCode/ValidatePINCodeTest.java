package RegexValidatePINCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatePINCodeTest {

    @Test
    public void validPins() {
        assertTrue(ValidatePINCode.validatePin("1234"));
        assertTrue(ValidatePINCode.validatePin("0000"));
        assertTrue(ValidatePINCode.validatePin("1111"));
        assertTrue(ValidatePINCode.validatePin("123456"));
        assertTrue(ValidatePINCode.validatePin("098765"));
        assertTrue(ValidatePINCode.validatePin("000000"));
        assertTrue(ValidatePINCode.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertFalse(ValidatePINCode.validatePin("a234"));
        assertFalse(ValidatePINCode.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertFalse(ValidatePINCode.validatePin("1"));
        assertFalse(ValidatePINCode.validatePin("12"));
        assertFalse(ValidatePINCode.validatePin("123"));
        assertFalse(ValidatePINCode.validatePin("12345"));
        assertFalse(ValidatePINCode.validatePin("1234567"));
        assertFalse(ValidatePINCode.validatePin("+111"));
        assertFalse(ValidatePINCode.validatePin("1.234"));
        assertFalse(ValidatePINCode.validatePin("00000000"));
    }

}