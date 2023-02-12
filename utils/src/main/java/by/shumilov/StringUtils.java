package by.shumilov;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Introduction to Gradle.
 */
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.toInt(str) >= 0;
    }
}
