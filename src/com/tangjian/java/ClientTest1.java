package com.tangjian.java;

public class ClientTest1 {
    static class Father {
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
        static {
            B = 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(Son.B);
    }
}
