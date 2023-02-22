package library;

import java.util.Arrays;

public class Book {
    private String nameOfBook;
    private String author;

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(String nameOfBook, String author) {
        this.nameOfBook = nameOfBook;
        this.author = author;
    }

}
