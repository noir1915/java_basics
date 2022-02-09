public class Book {

    private final String name;
    private final String author;
    private final int pageNumber;
    private final int ISBN;

    public Book(String name, String author, int pageNumber, int ISBN) {
        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getISBN() {
        return ISBN;
    }
}