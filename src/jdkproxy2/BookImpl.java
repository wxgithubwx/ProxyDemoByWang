package jdkproxy2;

public class BookImpl implements IBook {
    @Override
    public void addBook() {
        System.out.println("添加图书了");
    }
}
