package com.openlibing.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * {@link NumberUtils} 单元测试。
 */
class NumberUtilsTest {

    @Test
    @DisplayName("偶数返回 true")
    void isEvenShouldReturnTrueForEven() {
        assertTrue(NumberUtils.isEven(4));
    }

    @Test
    @DisplayName("奇数返回 false")
    void isEvenShouldReturnFalseForOdd() {
        assertFalse(NumberUtils.isEven(3));
    }

    @Test
    @DisplayName("求数组最大值")
    void maxShouldReturnMaximum() {
        assertEquals(9, NumberUtils.max(new int[] {3, 9, 5}));
    }

    @Test
    @DisplayName("数组为 null 时抛出 IllegalArgumentException")
    void maxShouldThrowExceptionForNull() {
        assertThrows(IllegalArgumentException.class, () -> NumberUtils.max(null));
    }

    @Test
    @DisplayName("空数组时抛出 IllegalArgumentException")
    void maxShouldThrowExceptionForEmpty() {
        assertThrows(IllegalArgumentException.class, () -> NumberUtils.max(new int[0]));
    }
}
