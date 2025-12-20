package org.idempiere.util;

/**
 * Utility class for context/session operations.
 * Provides thread-local storage for client, org, user, and role context.
 */
public final class ContextUtil {

    private static final ThreadLocal<Integer> CLIENT_ID = new ThreadLocal<>();
    private static final ThreadLocal<Integer> ORG_ID = new ThreadLocal<>();
    private static final ThreadLocal<Integer> USER_ID = new ThreadLocal<>();
    private static final ThreadLocal<Integer> ROLE_ID = new ThreadLocal<>();
    private static final ThreadLocal<Integer> WAREHOUSE_ID = new ThreadLocal<>();

    private ContextUtil() {
        // Utility class - no instantiation
    }

    public static void setClientId(Integer clientId) {
        CLIENT_ID.set(clientId);
    }

    public static Integer getClientId() {
        return CLIENT_ID.get();
    }

    public static void setOrgId(Integer orgId) {
        ORG_ID.set(orgId);
    }

    public static Integer getOrgId() {
        return ORG_ID.get();
    }

    public static void setUserId(Integer userId) {
        USER_ID.set(userId);
    }

    public static Integer getUserId() {
        return USER_ID.get();
    }

    public static void setRoleId(Integer roleId) {
        ROLE_ID.set(roleId);
    }

    public static Integer getRoleId() {
        return ROLE_ID.get();
    }

    public static void setWarehouseId(Integer warehouseId) {
        WAREHOUSE_ID.set(warehouseId);
    }

    public static Integer getWarehouseId() {
        return WAREHOUSE_ID.get();
    }

    public static void setContext(Integer clientId, Integer orgId, Integer userId, Integer roleId) {
        setClientId(clientId);
        setOrgId(orgId);
        setUserId(userId);
        setRoleId(roleId);
    }

    public static void clear() {
        CLIENT_ID.remove();
        ORG_ID.remove();
        USER_ID.remove();
        ROLE_ID.remove();
        WAREHOUSE_ID.remove();
    }

    public static boolean isLoggedIn() {
        return getClientId() != null && getUserId() != null;
    }

    public static boolean isSystemClient() {
        Integer clientId = getClientId();
        return clientId != null && clientId == 0;
    }

    public static boolean isSystemOrg() {
        Integer orgId = getOrgId();
        return orgId != null && orgId == 0;
    }
}
