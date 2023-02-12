package by.shumilov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    @Test
    void isPositiveNumberTrue() {
        assertTrue(StringUtils.isPositiveNumber("12"));
    }

    @Test
    void isPositiveNumberFalse() {
        assertFalse(StringUtils.isPositiveNumber("-456"));
    }
}