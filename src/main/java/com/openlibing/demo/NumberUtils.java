package com.openlibing.demo;

/**
 * 示例数字工具类，用于验证 UT 覆盖率上报流程。
 */
public final class NumberUtils {

    private NumberUtils() {
    }

    /**
     * 判断整数是否为偶数
     *
     * @param value 待判断整数
     * @return 偶数返回 true，奇数返回 false
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /**
     * 求数组中的最大值
     *
     * @param numbers 待比较数组
     * @return 数组中的最大值
     * @throws IllegalArgumentException 数组为 null 或为空时抛出
     */
    public static int max(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("numbers must not be empty");
        }
        int result = numbers[0];
        for (int number : numbers) {
            if (number > result) {
                result = number;
            }
        }
        return result;
    }
}
