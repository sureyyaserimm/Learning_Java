package Gun28._03_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }


    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;


    }
}
