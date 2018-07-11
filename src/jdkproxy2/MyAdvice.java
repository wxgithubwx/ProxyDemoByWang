package jdkproxy2;

public class MyAdvice {
    public void before(){
        System.out.println("调用方法开始了，开启事务");
    }

    public void after(){
        System.out.println("调用方法结束了，关闭事务");
    }
}
