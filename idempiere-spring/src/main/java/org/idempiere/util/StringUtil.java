package org.idempiere.util;

import java.util.Collection;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * Utility class for string operations.
 */
public final class StringUtil {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
    );

    private StringUtil() {
        // Utility class - no instantiation
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static String nvl(String str) {
        return str == null ? "" : str;
    }

    public static String nvl(String str, String defaultValue) {
        return str == null ? defaultValue : str;
    }

    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

    public static String upper(String str) {
        return str == null ? null : str.toUpperCase();
    }

    public static String lower(String str) {
        return str == null ? null : str.toLowerCase();
    }

    public static String capitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }

    public static String left(String str, int length) {
        if (str == null || length <= 0) {
            return "";
        }
        return str.length() <= length ? str : str.substring(0, length);
    }

    public static String right(String str, int length) {
        if (str == null || length <= 0) {
            return "";
        }
        return str.length() <= length ? str : str.substring(str.length() - length);
    }

    public static String padLeft(String str, int length, char padChar) {
        if (str == null) {
            str = "";
        }
        if (str.length() >= length) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i = str.length(); i < length; i++) {
            sb.append(padChar);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String padRight(String str, int length, char padChar) {
        if (str == null) {
            str = "";
        }
        if (str.length() >= length) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(str);
        for (int i = str.length(); i < length; i++) {
            sb.append(padChar);
        }
        return sb.toString();
    }

    public static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public static String join(Collection<?> collection, String delimiter) {
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Object item : collection) {
            if (!first) {
                sb.append(delimiter);
            }
            sb.append(item);
            first = false;
        }
        return sb.toString();
    }

    public static String[] split(String str, String delimiter) {
        if (isEmpty(str)) {
            return new String[0];
        }
        return str.split(Pattern.quote(delimiter));
    }

    public static boolean contains(String str, String searchStr) {
        return str != null && searchStr != null && str.contains(searchStr);
    }

    public static boolean containsIgnoreCase(String str, String searchStr) {
        return str != null && searchStr != null && str.toLowerCase().contains(searchStr.toLowerCase());
    }

    public static String replace(String str, String target, String replacement) {
        if (str == null) {
            return null;
        }
        return str.replace(target, replacement);
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {
        return (str1 == null && str2 == null) || (str1 != null && str1.equalsIgnoreCase(str2));
    }
}
