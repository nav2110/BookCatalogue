package viracademy;

import java.util.ArrayList;


public class BookCatalog {
    /**
     * Create an arraylist of type Book to store all the books
     */
    private ArrayList<Book> books;

    public BookCatalog(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


}
