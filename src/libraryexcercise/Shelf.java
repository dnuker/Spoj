package libraryexcercise;


import java.util.ArrayList;
import java.util.List;

public class Shelf {
    String name;
    List<Book> books = new ArrayList<Book>();

    public Shelf(String name) {
        this.name = name;
    }

    public void addsBook(Book bookName) {
        books.add(bookName);
    }

 /*   @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n\n");

        for (Book book : books) {
            sb.append(book.toString());
        }
        return sb.toString();
    }*/
}

