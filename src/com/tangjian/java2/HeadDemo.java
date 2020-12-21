package com.tangjian.java2;

/**
 * 设置堆的大小： -Xms10m -Xmx10m
 * 默认对大小：256m
 */
public class HeadDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
