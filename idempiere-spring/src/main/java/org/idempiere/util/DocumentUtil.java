package org.idempiere.util;

/**
 * Utility class for document status operations.
 */
public final class DocumentUtil {

    // Document Status Constants
    public static final String STATUS_DRAFTED = "DR";
    public static final String STATUS_COMPLETED = "CO";
    public static final String STATUS_APPROVED = "AP";
    public static final String STATUS_INVALID = "IN";
    public static final String STATUS_NOT_APPROVED = "NA";
    public static final String STATUS_VOIDED = "VO";
    public static final String STATUS_REVERSED = "RE";
    public static final String STATUS_CLOSED = "CL";
    public static final String STATUS_UNKNOWN = "??";
    public static final String STATUS_IN_PROGRESS = "IP";
    public static final String STATUS_WAITING_PAYMENT = "WP";
    public static final String STATUS_WAITING_CONFIRMATION = "WC";

    // Document Action Constants
    public static final String ACTION_COMPLETE = "CO";
    public static final String ACTION_APPROVE = "AP";
    public static final String ACTION_REJECT = "RJ";
    public static final String ACTION_POST = "PO";
    public static final String ACTION_VOID = "VO";
    public static final String ACTION_CLOSE = "CL";
    public static final String ACTION_REVERSE_CORRECT = "RC";
    public static final String ACTION_REVERSE_ACCRUAL = "RA";
    public static final String ACTION_REACTIVATE = "RE";
    public static final String ACTION_NONE = "--";
    public static final String ACTION_PREPARE = "PR";
    public static final String ACTION_UNLOCK = "XL";
    public static final String ACTION_INVALIDATE = "IN";
    public static final String ACTION_WAIT_COMPLETE = "WC";

    private DocumentUtil() {
        // Utility class - no instantiation
    }

    public static boolean isDrafted(String docStatus) {
        return STATUS_DRAFTED.equals(docStatus);
    }

    public static boolean isCompleted(String docStatus) {
        return STATUS_COMPLETED.equals(docStatus);
    }

    public static boolean isApproved(String docStatus) {
        return STATUS_APPROVED.equals(docStatus);
    }

    public static boolean isVoided(String docStatus) {
        return STATUS_VOIDED.equals(docStatus);
    }

    public static boolean isReversed(String docStatus) {
        return STATUS_REVERSED.equals(docStatus);
    }

    public static boolean isClosed(String docStatus) {
        return STATUS_CLOSED.equals(docStatus);
    }

    public static boolean isInProgress(String docStatus) {
        return STATUS_IN_PROGRESS.equals(docStatus);
    }

    public static boolean isActive(String docStatus) {
        return isDrafted(docStatus) || isInProgress(docStatus) || isApproved(docStatus);
    }

    public static boolean isProcessed(String docStatus) {
        return isCompleted(docStatus) || isVoided(docStatus) || isReversed(docStatus) || isClosed(docStatus);
    }

    public static String getStatusName(String docStatus) {
        if (docStatus == null) {
            return "Unknown";
        }
        return switch (docStatus) {
            case STATUS_DRAFTED -> "Drafted";
            case STATUS_COMPLETED -> "Completed";
            case STATUS_APPROVED -> "Approved";
            case STATUS_INVALID -> "Invalid";
            case STATUS_NOT_APPROVED -> "Not Approved";
            case STATUS_VOIDED -> "Voided";
            case STATUS_REVERSED -> "Reversed";
            case STATUS_CLOSED -> "Closed";
            case STATUS_IN_PROGRESS -> "In Progress";
            case STATUS_WAITING_PAYMENT -> "Waiting Payment";
            case STATUS_WAITING_CONFIRMATION -> "Waiting Confirmation";
            default -> "Unknown";
        };
    }

    public static String getActionName(String docAction) {
        if (docAction == null) {
            return "None";
        }
        return switch (docAction) {
            case ACTION_COMPLETE -> "Complete";
            case ACTION_APPROVE -> "Approve";
            case ACTION_REJECT -> "Reject";
            case ACTION_POST -> "Post";
            case ACTION_VOID -> "Void";
            case ACTION_CLOSE -> "Close";
            case ACTION_REVERSE_CORRECT -> "Reverse - Correct";
            case ACTION_REVERSE_ACCRUAL -> "Reverse - Accrual";
            case ACTION_REACTIVATE -> "Re-Activate";
            case ACTION_NONE -> "<None>";
            case ACTION_PREPARE -> "Prepare";
            case ACTION_UNLOCK -> "Unlock";
            case ACTION_INVALIDATE -> "Invalidate";
            case ACTION_WAIT_COMPLETE -> "Wait Complete";
            default -> "None";
        };
    }

    public static boolean isYes(String value) {
        return "Y".equals(value);
    }

    public static boolean isNo(String value) {
        return "N".equals(value) || value == null;
    }

    public static String toYesNo(boolean value) {
        return value ? "Y" : "N";
    }
}
