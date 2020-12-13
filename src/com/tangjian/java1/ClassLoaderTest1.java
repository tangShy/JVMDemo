package com.tangjian.java1;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

/**
 * 演示各加载器默认能够加载的api路径
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("***********启动类加载器***************");
        // 获取BootstrapClassLoader能够加载的api的路径
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }

        //从上面的路径中随意选择一个类 看看他的类加载器是什么
        //String位于 \jdk1.8.0_211\jre\lib\rt.jar 下，引导类加载器加载它
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println(classLoader);    //null

        System.out.println("***********扩展类加载器***************");
        // 获取ExtensionClassLoader能够加载的api的路径
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }

        //从上面的路径中随意选择一个类 看看他的类加载器是什么
        //CurveDB位于 \jdk1.8.0_211\jre\lib\ext\sunec.jar 下
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
