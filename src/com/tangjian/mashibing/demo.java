package com.tangjian.mashibing;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

//6min
public class demo {
    public static void main(String[] args) throws IOException {
        // 强引用
        M m = new M();
        m = null;
        System.gc();
        System.out.println(m);
        System.in.read();

        // 软引用
//        SoftReference<byte[]> m1 = new SoftReference<>(new byte[1024*1024*10]);
//        System.out.println(m1.get());
//        System.gc();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(m1.get());
//        byte[] b = new byte[1024*1024*8];
//        System.out.println(m1.get());


//        // 弱引用
//        WeakReference<M> m2 = new WeakReference<M>(new M());
//
//        System.out.println(m2.get());
//        System.gc();
//        System.out.println(m2.get());
    }
}
