package jdkproxy;

public class Book {
    String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("书籍名称是："+name);
    }
}
