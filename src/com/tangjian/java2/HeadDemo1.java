package com.tangjian.java2;

/**
 * 设置堆的大小： -Xms20m -Xmx20m
 */
public class HeadDemo1 {
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
