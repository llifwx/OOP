package Library_System;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1997, 320);

        book.displayInfo();

        System.out.println();
        System.out.println(book);
    }
}
