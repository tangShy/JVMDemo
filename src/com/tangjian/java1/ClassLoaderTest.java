package com.tangjian.java1;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器(Application Class Loader)
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  //sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取系统类加载器的上层：扩展类加载器(Extension Class Loader)
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);  //sun.misc.Launcher$ExtClassLoader@1b6d3586

        //获取上上层：启动类加载器(Bootstrap Class Loader)
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader); // 返回null，获取不到? 因为是由C/C++语言编写的

        //对于用户自定义类来说：默认使用系统类加载器来加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);    //sun.misc.Launcher$AppClassLoader@18b4aac2

        //对于一些常用的类，如：String，是由启动类加载器来加载的。---> 系统的核心类库都是使用启动类加载器来加载的
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);   //null

    }
}
