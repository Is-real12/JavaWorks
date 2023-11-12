package BookManageMent;

import java.util.ArrayList;

public class Member {
    private String name;
    private int id;
    private final ArrayList<Book>books;

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
        this.books = new ArrayList<>();
    }
    public void borrowBook(Book book){
        if (book.isAvailable()){
            book.borrow();
            books.add(book);
            System.out.println("you just borrowed: "+book.getTitle());
        }else {
            System.out.println("book is not available for borrowing: "+book);
        }
    }
    public void returnBook(Book book){
        book.returnBook();
        books.remove(book);
        System.out.println("you just return: "+book.getTitle());

    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
