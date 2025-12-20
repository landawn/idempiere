package org.idempiere.util;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.regex.Pattern;

/**
 * Utility class for validation operations.
 */
public final class ValidationUtil {

    private static final Pattern PHONE_PATTERN = Pattern.compile("^[+]?[0-9]{10,15}$");
    private static final Pattern POSTAL_CODE_PATTERN = Pattern.compile("^[A-Za-z0-9\\s-]{3,10}$");

    private ValidationUtil() {
        // Utility class - no instantiation
    }

    public static void requireNonNull(Object value, String fieldName) {
        if (value == null) {
            throw new IllegalArgumentException(fieldName + " cannot be null");
        }
    }

    public static void requireNonEmpty(String value, String fieldName) {
        if (StringUtil.isEmpty(value)) {
            throw new IllegalArgumentException(fieldName + " cannot be empty");
        }
    }

    public static void requireNonBlank(String value, String fieldName) {
        if (StringUtil.isBlank(value)) {
            throw new IllegalArgumentException(fieldName + " cannot be blank");
        }
    }

    public static void requireNonEmpty(Collection<?> collection, String fieldName) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be empty");
        }
    }

    public static void requirePositive(BigDecimal value, String fieldName) {
        if (!NumberUtil.isPositive(value)) {
            throw new IllegalArgumentException(fieldName + " must be positive");
        }
    }

    public static void requireNonNegative(BigDecimal value, String fieldName) {
        if (NumberUtil.isNegative(value)) {
            throw new IllegalArgumentException(fieldName + " cannot be negative");
        }
    }

    public static void requirePositive(Integer value, String fieldName) {
        if (value == null || value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be positive");
        }
    }

    public static void requireInRange(int value, int min, int max, String fieldName) {
        if (value < min || value > max) {
            throw new IllegalArgumentException(fieldName + " must be between " + min + " and " + max);
        }
    }

    public static void requireInRange(BigDecimal value, BigDecimal min, BigDecimal max, String fieldName) {
        if (value == null || value.compareTo(min) < 0 || value.compareTo(max) > 0) {
            throw new IllegalArgumentException(fieldName + " must be between " + min + " and " + max);
        }
    }

    public static void requireMaxLength(String value, int maxLength, String fieldName) {
        if (value != null && value.length() > maxLength) {
            throw new IllegalArgumentException(fieldName + " cannot exceed " + maxLength + " characters");
        }
    }

    public static void requireValidEmail(String email, String fieldName) {
        if (!StringUtil.isValidEmail(email)) {
            throw new IllegalArgumentException(fieldName + " is not a valid email address");
        }
    }

    public static boolean isValidPhone(String phone) {
        return phone != null && PHONE_PATTERN.matcher(phone.replaceAll("[\\s()-]", "")).matches();
    }

    public static void requireValidPhone(String phone, String fieldName) {
        if (!isValidPhone(phone)) {
            throw new IllegalArgumentException(fieldName + " is not a valid phone number");
        }
    }

    public static boolean isValidPostalCode(String postalCode) {
        return postalCode != null && POSTAL_CODE_PATTERN.matcher(postalCode).matches();
    }

    public static void requireValidPostalCode(String postalCode, String fieldName) {
        if (!isValidPostalCode(postalCode)) {
            throw new IllegalArgumentException(fieldName + " is not a valid postal code");
        }
    }

    public static void requireTrue(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void requireFalse(boolean condition, String message) {
        if (condition) {
            throw new IllegalArgumentException(message);
        }
    }

    public static boolean isValidId(Integer id) {
        return id != null && id > 0;
    }

    public static void requireValidId(Integer id, String fieldName) {
        if (!isValidId(id)) {
            throw new IllegalArgumentException(fieldName + " is not a valid ID");
        }
    }
}
