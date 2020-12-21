package com.tangjian.chapter5;

/**
 * 栈溢出演示：java.lang.StackOverflowError
 * 默认情况下，count: 11402
 * 设置栈的大小：-Xss256k  则count: 2461
 */
public class StackTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
