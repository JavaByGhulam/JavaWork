package arrayexample;

import java.util.Scanner;

public class ArraysExempel1 {

    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;
    static BookListManager myBookListManager = new BookListManager();

    public static void main(String[] args) {

        while (loop) {

            switchChoice(menu());
        }
    }

    public static void switchChoice(int choice) {

        switch (choice) {
            case 0:
                loop = false;
                break;
            case 1:
                System.out.print("Book name: ");
                String name = readText();
                System.out.println("Book Isbn: ");
                String isbn = readText();
                Book b = new Book(name, isbn);
                myBookListManager.addBook(b);
                break;
            case 2:
                System.out.print("Which index: ");
                int choice2 = readNumber();
                myBookListManager.removeBook(choice2);
                //myBookListManager.removeBook(readNumber());
                break;
            case 3:
                System.out.print("Which index: ");
                int choice3 = readNumber();
                Book book = myBookListManager.getBook(choice3);
                System.out.println(book);
                break;
            case 4:
                break;
            case 5:   
                System.out.print("Which index: ");
                 myBookListManager.printBook(readNumber());
                break;
            case 6:
                myBookListManager.clearList();
                break;
            case 7:
                System.out.print("Size: ");
                System.out.println(myBookListManager.size());
                break;
            default:
                System.out.println("Invalid choice! (0-6)");

        }

    }

    public static int menu() {
        System.out.println("1. Add book");
        System.out.println("2. Remove book");
        System.out.println("3. Get book");
        System.out.println("4. List books");
        System.out.println("5. Print book");
        System.out.println("6. Clear list");
        System.out.println("7. Print size");
        System.out.println("0. Exit");

        System.out.print("\nMake a choice: ");

        return readNumber();
    }

    public static int readNumber() {
        int tal = sc.nextInt();
        sc.nextLine();
        return tal;
    }

    public static String readText() {
        return sc.nextLine();
    }

}
