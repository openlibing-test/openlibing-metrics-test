package com.openlibing.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * {@link Calculator} 单元测试。
 */
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("两数相加返回正确结果")
    void addShouldReturnSum() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("两数相减返回正确结果")
    void subtractShouldReturnDifference() {
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    @DisplayName("两数相乘返回正确结果")
    void multiplyShouldReturnProduct() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("两数相除返回正确结果")
    void divideShouldReturnQuotient() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    @DisplayName("除数为 0 时抛出 IllegalArgumentException")
    void divideByZeroShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));
    }
}
