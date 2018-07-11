package jdkproxy;

public class StaticProxy {
    MyAdvice myAdvice=new MyAdvice();
    Book book=new Book();
    public void setName(String name){
        myAdvice.before();
        book.setName(name);
        myAdvice.after();
    }
}
