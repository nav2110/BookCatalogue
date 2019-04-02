package viracademy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Property of Alex Virastau
 * Create a small application that mimics a library catalog. It needs to be able to add books,
 * delete books and list books. Books are of two kinds: novels and art albums.
 * They both have names and number of pages. Novels have type (like mystery, sf, etc.) while albums have paper quality.
 * * Model these entities (book, novel, album) with different classes and inheritance.
 */


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int option;

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        //Define a printAndReadMenu to get input from the user
        printAndReadMenuOption();

        //Create a menu where the user can call methods to add, remove, list books, and quit the menu.
        do {
            switch (option) {
                case 1:

                    addBooks(books);


                    break;

                case 2:
                    removeBooks(books);

                    break;

                case 3:
                    listBooks(books);

                    break;

                default:
                    printAndReadMenuOption();
                    break;
            }

        } while (option != 0);

    }

    private static void printAndReadMenuOption() {

            System.out.println("Introduce \"1\" to add books, \"2\" to remove books, " +
                    "\"3\" to list the books, \"0\" to quit.");
            option = scanner.nextInt();
            scanner.nextLine();



    }


    private static void listBooks(ArrayList<Book> books) {
        if (books.size() == 0) {
            System.out.println("There are no books in the catalogue.");
        }

        for (Book book : books) {
            //get each objects common fields, stored them in variables, and print them
            String name = book.getName();
            int numberOfPages = book.getNumberOfPages();

            //get the fields specific to either a novel or an album object. Use downcasting
            if (book instanceof Novel) {
                String type = ((Novel) book).getType();
                System.out.println("\"" + name + "\" is a novel. " +
                        "It has " + numberOfPages + " pages. Its type is " + type + ".");
            } else {
                String quality = ((Album) book).getQuality();
                System.out.println("\"" + name + "\" is a novel. " +
                        "It has " + numberOfPages + " pages. It is of " + quality + " quality.");
            }

        }
        printAndReadMenuOption();

    }

    private static void addBooks(ArrayList<Book> books) {
        //initialize the common fields of any object
        String name;
        int numberOfPages;

        System.out.println("Is the book you are introducing a novel(type \"novel\") or " +
                "an album (type \"album\")? ");

        String bookType = scanner.next();
        scanner.nextLine();

        if (bookType.equalsIgnoreCase("novel")) {

            System.out.println("Introduce the name of the novel: ");
            name = scanner.nextLine();


            System.out.println("Introduce the number of pages: ");
            numberOfPages = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Introduce the type of the novel: ");
            String type = scanner.nextLine();

            books.add(new Novel(name, numberOfPages, type));

        } else if (bookType.equalsIgnoreCase("album")) {

            System.out.println("Introduce the name of the album: ");
            name = scanner.nextLine();

            System.out.println("Introduce the number of pages: ");
            numberOfPages = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Introduce the quality of the album: ");
            String quality = scanner.nextLine();
            books.add(new Album(name, numberOfPages, quality));
        } else {
            System.out.println("Wrong input. Choose \"novel\" or \"album\".");
        }

        printAndReadMenuOption();

    }

    private static void removeBooks(ArrayList<Book> books) {
        System.out.println("What is the name of the book you want to remove? ");
        String name = scanner.nextLine().toLowerCase();

        for (int i = 0; i < books.size(); i++) {
            if (name.equals(books.get(i).getName().toLowerCase())) {
                books.remove(i);
            }
        }
        printAndReadMenuOption();

    }


}




