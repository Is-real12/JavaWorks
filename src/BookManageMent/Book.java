package BookManageMent;

public class Book{
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("you just borrowed " + title);
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(){
        available = true;
        System.out.println("You just returned "+title);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return available;
    }
}
