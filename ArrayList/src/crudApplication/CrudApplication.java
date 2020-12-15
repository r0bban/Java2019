package crudApplication;

public class CrudApplication {

    static boolean loop = true;

    public static void main(String[] args) {

        while (loop) {
            switchChoice(menu());
        }
    }

    public static void switchChoice(int val) {
        switch (val) {
            case 1:
                Library.addBook();
                break;
            case 2:
                Library.removeBookById();
                break;
            case 3:
                Library.removeBookByName();
                break;
            case 4:
                Library.printBook();
                break;
            case 5:
                Library.printBooks();
                break;
            case 6:
                Library.updateBookNameById();
                break;
            case 7:
                System.out.println(Library.numberOfBooks());
                break;
            case 0:
                loop = false;
                Library.sc.close();
                break;

            default:
                System.out.println("Wrong choice");

        }

    }

    public static int menu() {
        System.out.println("\n\n1. Add book");
        System.out.println("2. Remove book by id");
        System.out.println("3. Remove book by name");
        System.out.println("4. Show book");
        System.out.println("5. Show all books");
        System.out.println("6. Update book name");
        System.out.println("7. Number of books in library");
        System.out.println("0. Exit");

        System.out.println("\nMake a choice");
        int choice = Library.sc.nextInt();
        Library.sc.nextLine();
        return choice;
    }

}
