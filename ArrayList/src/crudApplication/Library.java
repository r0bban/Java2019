package crudApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static ArrayList<Book> library = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addBook() {

        System.out.println("Book name: ");
        String bookName = sc.nextLine();

        System.out.println("Author name: ");
        String authorName = sc.nextLine();

        Book b = new Book(bookName, authorName);
        library.add(b);
    }

    public static void removeBookById() {
        System.out.println("Book Id: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        for (int i = library.size() - 1; i <= 0; i--) {
            if (library.get(i).getId() == bookId) {
                library.remove(library.get(i));
            }
        }
    }

    public static void removeBookByName() {
        System.out.println("Book name: ");
        String bookName = sc.nextLine();
        for (int i = library.size() - 1; i <= 0; i--) {
            if (library.get(i).getName().equalsIgnoreCase(bookName)) {
                library.remove(library.get(i));
            }
        }
    }

    public static int numberOfBooks() {
        return library.size();
    }

    public static void printBooks() {

        System.out.println(library);
    }

    public static void printBook() {
        System.out.println("Book id: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        for (Book book : library) {
            if (book.getId() == bookId) {
                System.out.println(book);
            }
        }
    }

    public static void updateBookNameById() {
        System.out.println("Book id: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        for (Book book : library) {
            if (book.getId() == bookId) {
                System.out.println(" What is new book name: ");
                String newName = sc.nextLine();
                book.setName(newName);
            }

        }

    }

}
