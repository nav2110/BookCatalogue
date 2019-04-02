package viracademy;

/**
 * this is the superclass that stores features common to both types of listing
 */

public class Book {
    /**
     * Each book has @param name and @param numberOfPages
     */
    private String name;
    private int numberOfPages;


    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
