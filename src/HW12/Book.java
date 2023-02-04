package HW12;

public class Book {
    private String name;
    private Author author;
    private int publishingYear;
    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = ;
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
}
