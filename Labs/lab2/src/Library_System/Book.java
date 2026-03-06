package Library_System;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int numberOfPages) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public void displayInfo() {
        System.out.println("Item Type: " + getItemType());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Number of Pages: " + numberOfPages);
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Pages: " + numberOfPages;
    }
}
