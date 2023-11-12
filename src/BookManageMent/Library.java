package BookManageMent;

import java.util.ArrayList;

public class Library {
    private String name;
    private String location;
    private ArrayList<Book> books;
    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("you just added: "+book.getTitle());
    }

    public void removeBook(Book book){
        books.remove(book);
        System.out.println("You Just Remove: "+book +"from library");
    }
    public void searchBook(String title){
        for (Book book1:books) {
            if (book1.getTitle().equals(title)){
                System.out.println("Book found: "+title);
                break;
            }else {
                System.out.println("Book not found: "+toString(title));

            }
        }

    }

    private String toString(String title) {
        return title;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getLocation() {
        return location;
    }

}
