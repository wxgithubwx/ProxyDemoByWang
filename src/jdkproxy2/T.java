package jdkproxy2;

import java.lang.reflect.Proxy;

public class T {
    public static void main(String[] args) {
        /**
         * loader :对生成的代理类对象进行加载的ClassLoader
         * interfaces :代理对象会实现这些接口
         * h: 动态代理对象调用方法时，要发送到哪个InvocationHandler
         */
        /*BookImpl book=new BookImpl();
        IBook iBook = (IBook)Proxy.newProxyInstance(book.getClass().getClassLoader(),
                book.getClass().getInterfaces(), new BookProxy(book));
        iBook.addBook();*/

        JavaBookImpl javaBook=new JavaBookImpl();
        IBook jBook = (IBook)Proxy.newProxyInstance(javaBook.getClass().getClassLoader(),
                javaBook.getClass().getInterfaces(), new BookProxy(javaBook));
        jBook.addBook();
    }
}
