package com.tangjian.java2;

public class LocalVariablesTest {
    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num= 0;
        test.test1();
    }

    private void test1() {
        int i = 2;
        System.out.println("test1");
    }
}
