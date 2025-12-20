package org.idempiere.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * Utility class for date operations.
 */
public final class DateUtil {

    private static final DateTimeFormatter DEFAULT_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter DEFAULT_DATETIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private DateUtil() {
        // Utility class - no instantiation
    }

    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    public static LocalDate today() {
        return LocalDate.now();
    }

    public static LocalDateTime startOfDay(LocalDate date) {
        return date.atStartOfDay();
    }

    public static LocalDateTime endOfDay(LocalDate date) {
        return date.atTime(23, 59, 59, 999999999);
    }

    public static LocalDateTime startOfMonth(LocalDate date) {
        return date.with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay();
    }

    public static LocalDateTime endOfMonth(LocalDate date) {
        return date.with(TemporalAdjusters.lastDayOfMonth()).atTime(23, 59, 59, 999999999);
    }

    public static LocalDateTime startOfYear(LocalDate date) {
        return date.with(TemporalAdjusters.firstDayOfYear()).atStartOfDay();
    }

    public static LocalDateTime endOfYear(LocalDate date) {
        return date.with(TemporalAdjusters.lastDayOfYear()).atTime(23, 59, 59, 999999999);
    }

    public static LocalDateTime fromDate(Date date) {
        if (date == null) {
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static Date toDate(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static String formatDate(LocalDate date) {
        if (date == null) {
            return null;
        }
        return date.format(DEFAULT_DATE_FORMAT);
    }

    public static String formatDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.format(DEFAULT_DATETIME_FORMAT);
    }

    public static LocalDate parseDate(String dateStr) {
        if (dateStr == null || dateStr.isEmpty()) {
            return null;
        }
        return LocalDate.parse(dateStr, DEFAULT_DATE_FORMAT);
    }

    public static LocalDateTime parseDateTime(String dateTimeStr) {
        if (dateTimeStr == null || dateTimeStr.isEmpty()) {
            return null;
        }
        return LocalDateTime.parse(dateTimeStr, DEFAULT_DATETIME_FORMAT);
    }

    public static boolean isBetween(LocalDateTime date, LocalDateTime start, LocalDateTime end) {
        if (date == null) {
            return false;
        }
        return !date.isBefore(start) && !date.isAfter(end);
    }

    public static long daysBetween(LocalDate start, LocalDate end) {
        return java.time.temporal.ChronoUnit.DAYS.between(start, end);
    }

    public static LocalDateTime addDays(LocalDateTime date, int days) {
        return date.plusDays(days);
    }

    public static LocalDateTime addMonths(LocalDateTime date, int months) {
        return date.plusMonths(months);
    }

    public static LocalDateTime addYears(LocalDateTime date, int years) {
        return date.plusYears(years);
    }
}
