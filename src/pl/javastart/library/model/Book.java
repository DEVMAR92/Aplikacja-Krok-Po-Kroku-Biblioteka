package pl.javastart.library.model;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;

    public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public Book(Book book) {
        this(book.getTitle(), book.getAuthor(), book.getReleaseDate(), book.getPages(), book.getPublisher(), book.getIsbn());
    }

    private String getTitle() {
        return title;
    }

    private String getAuthor() {
        return author;
    }

    private int getReleaseDate() {
        return releaseDate;
    }

    private int getPages() {
        return pages;
    }

    private String getPublisher() {
        return publisher;
    }

    private String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}
