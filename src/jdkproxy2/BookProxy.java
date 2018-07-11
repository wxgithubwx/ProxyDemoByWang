package jdkproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BookProxy implements InvocationHandler {
    Object object;

    public BookProxy(Object object) {
        this.object = object;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 我们调用的真实对象的方法
     * @param args  要调用真实对象的方法时接受的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAdvice myAdvice=new MyAdvice();
        myAdvice.before();
        Object o = method.invoke(object, args);
        myAdvice.after();
        return o;
    }
}
