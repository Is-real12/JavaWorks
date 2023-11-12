package BookManageMent;

import java.util.ArrayList;

public class Mina {
    public static void main(String[] args) {
        Library library = new Library("odun", "ogustin 4");

        Book book = new Book("God Will Make A way", "Auguest SETO", "23323");
        Book book1 = new Book("Dansaki re", "october question", "ole");
        library.addBook(book1);
        library.addBook(book);

        Member member = new Member("Israel", 1232);
        member.borrowBook(book);


        library.searchBook("God Will Make A way");

        member.returnBook(book1);
    }
}
