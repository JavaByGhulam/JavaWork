package arrayexample;


import arrayexample.Book;



public class BookListManager {

    int count = 0;
    Book[] books = new Book[100];

    public void addBook(Book b) {
        books[count] = b;
        count++;
        //count=count+1;
        if (books.length == count) {
            Book[] tempList = new Book[count * 2];

            for (int i = 0; i < count; i++) {
                tempList[i] = books[i];
            }

            books = tempList;
        }
    }

    public int size() {
        return count;
    }

    public void removeBook(int index) {
        int tal = 5;
        books[index] = books[count - 1];
        books[count - 1] = null;
        count = count - 1;
    }

    public void clearList() {
        for (int i = 0; i < count; i++) {
            books[i] = null;
        }
        count = 0;
    }

    public Book getBook(int index) {
        return books[index];
    }
    public void printBook(int index) {
        System.out.println(books[index]);
    }

    public String toString() {
        return "java";
    }
}
