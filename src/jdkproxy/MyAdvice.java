package jdkproxy;

public class MyAdvice {

    public void before(){
        System.out.println("set方法前执行");
    }
    public void after(){
        System.out.println("set方法后执行");
    }
}
