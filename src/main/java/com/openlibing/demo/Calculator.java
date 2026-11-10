package com.openlibing.demo;

/**
 * 示例计算器，用于验证 UT 覆盖率上报流程。
 */
public class Calculator {

    /**
     * 两数相加
     *
     * @param a 加数
     * @param b 加数
     * @return 两数之和
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 两数相减
     *
     * @param a 被减数
     * @param b 减数
     * @return 两数之差
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * 两数相乘
     *
     * @param a 乘数
     * @param b 乘数
     * @return 两数之积
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 两数相除
     *
     * @param dividend 被除数
     * @param divisor 除数，不能为 0
     * @return 两数之商
     * @throws IllegalArgumentException 除数为 0 时抛出
     */
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("divisor must not be zero");
        }
        return dividend / divisor;
    }
}
