package com.openlibing.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * {@link StringUtils} 单元测试。
 */
class StringUtilsTest {

    @Test
    @DisplayName("null 视为空白字符串")
    void isBlankShouldReturnTrueForNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    @DisplayName("全空白字符串视为空白字符串")
    void isBlankShouldReturnTrueForWhitespace() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    @DisplayName("非空白字符串返回 false")
    void isBlankShouldReturnFalseForContent() {
        assertFalse(StringUtils.isBlank("openlibing"));
    }

    @Test
    @DisplayName("反转字符串")
    void reverseShouldReturnReversedValue() {
        assertEquals("gnibilnepo", StringUtils.reverse("openlibing"));
    }

    @Test
    @DisplayName("反转 null 返回 null")
    void reverseShouldReturnNullForNull() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    @DisplayName("转大写")
    void upperCaseShouldReturnUpperCase() {
        assertEquals("OPENLIBING", StringUtils.upperCase("openlibing"));
    }

    @Test
    @DisplayName("null 转大写返回 null")
    void upperCaseShouldReturnNullForNull() {
        assertNull(StringUtils.upperCase(null));
    }
}
