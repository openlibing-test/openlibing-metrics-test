package com.openlibing.demo;

/**
 * 示例字符串工具类，用于验证 UT 覆盖率上报流程。
 */
public final class StringUtils {

    private StringUtils() {
    }

    /**
     * 判断字符串是否为空，null 或全空白均视为空
     *
     * @param value 待判断字符串
     * @return 为空返回 true，否则返回 false
     */
    public static boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * 反转字符串
     *
     * @param value 原字符串
     * @return 反转后的字符串，入参为 null 时返回 null
     */
    public static String reverse(String value) {
        if (value == null) {
            return null;
        }
        return new StringBuilder(value).reverse().toString();
    }

    /**
     * 字符串转大写
     *
     * @param value 原字符串
     * @return 大写字符串，入参为 null 时返回 null
     */
    public static String upperCase(String value) {
        return value == null ? null : value.toUpperCase();
    }
}
