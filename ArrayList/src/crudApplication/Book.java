package crudApplication;

public class Book {

    private int id;
    private String name;
    private String author;

    int idGenerator = 1;

    public Book(String name, String author) {
        this.id = idGenerator;
        idGenerator++;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", author=" + author + "\n";
    }

}
