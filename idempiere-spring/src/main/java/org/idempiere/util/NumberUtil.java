package org.idempiere.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Utility class for number operations.
 */
public final class NumberUtil {

    public static final BigDecimal ZERO = BigDecimal.ZERO;
    public static final BigDecimal ONE = BigDecimal.ONE;
    public static final BigDecimal HUNDRED = new BigDecimal("100");
    public static final int DEFAULT_PRECISION = 2;
    public static final RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_UP;

    private NumberUtil() {
        // Utility class - no instantiation
    }

    public static BigDecimal nvl(BigDecimal value) {
        return value == null ? ZERO : value;
    }

    public static BigDecimal nvl(BigDecimal value, BigDecimal defaultValue) {
        return value == null ? defaultValue : value;
    }

    public static boolean isZero(BigDecimal value) {
        return value == null || value.compareTo(ZERO) == 0;
    }

    public static boolean isPositive(BigDecimal value) {
        return value != null && value.compareTo(ZERO) > 0;
    }

    public static boolean isNegative(BigDecimal value) {
        return value != null && value.compareTo(ZERO) < 0;
    }

    public static BigDecimal round(BigDecimal value, int precision) {
        if (value == null) {
            return null;
        }
        return value.setScale(precision, DEFAULT_ROUNDING);
    }

    public static BigDecimal round(BigDecimal value) {
        return round(value, DEFAULT_PRECISION);
    }

    public static BigDecimal add(BigDecimal... values) {
        BigDecimal result = ZERO;
        for (BigDecimal value : values) {
            if (value != null) {
                result = result.add(value);
            }
        }
        return result;
    }

    public static BigDecimal subtract(BigDecimal value1, BigDecimal value2) {
        return nvl(value1).subtract(nvl(value2));
    }

    public static BigDecimal multiply(BigDecimal value1, BigDecimal value2) {
        if (value1 == null || value2 == null) {
            return ZERO;
        }
        return value1.multiply(value2);
    }

    public static BigDecimal divide(BigDecimal dividend, BigDecimal divisor, int precision) {
        if (dividend == null || divisor == null || isZero(divisor)) {
            return ZERO;
        }
        return dividend.divide(divisor, precision, DEFAULT_ROUNDING);
    }

    public static BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
        return divide(dividend, divisor, DEFAULT_PRECISION);
    }

    public static BigDecimal percentage(BigDecimal value, BigDecimal percentage) {
        if (value == null || percentage == null) {
            return ZERO;
        }
        return value.multiply(percentage).divide(HUNDRED, DEFAULT_PRECISION, DEFAULT_ROUNDING);
    }

    public static BigDecimal abs(BigDecimal value) {
        return value == null ? null : value.abs();
    }

    public static BigDecimal negate(BigDecimal value) {
        return value == null ? null : value.negate();
    }

    public static BigDecimal min(BigDecimal value1, BigDecimal value2) {
        if (value1 == null) return value2;
        if (value2 == null) return value1;
        return value1.compareTo(value2) <= 0 ? value1 : value2;
    }

    public static BigDecimal max(BigDecimal value1, BigDecimal value2) {
        if (value1 == null) return value2;
        if (value2 == null) return value1;
        return value1.compareTo(value2) >= 0 ? value1 : value2;
    }

    public static int compare(BigDecimal value1, BigDecimal value2) {
        return nvl(value1).compareTo(nvl(value2));
    }

    public static boolean equals(BigDecimal value1, BigDecimal value2) {
        return compare(value1, value2) == 0;
    }

    public static BigDecimal toBigDecimal(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        try {
            return new BigDecimal(value.trim());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Integer toInteger(String value) {
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
