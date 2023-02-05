package HW12;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj.getClass().equals(Book.class)) return false;
        Book other = (Book) obj;
        return Objects.equals(this.name, other.name)
                && Objects.equals(this.author, other.author)
                && Objects.equals(this.publishingYear, other.publishingYear);
    }
}
