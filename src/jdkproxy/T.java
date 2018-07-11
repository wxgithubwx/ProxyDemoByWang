package jdkproxy;

public class T {

    /**
     * 静态代理类
     * 代理Book
     *
     * 缺点：
     *   代码量过多
     */
    public static void main(String[] args) {
        StaticProxy proxy=new StaticProxy();
        proxy.setName("java");
    }
}
