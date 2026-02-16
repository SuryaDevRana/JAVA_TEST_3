package test3.libraryMangementSYsytem;

public class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook(new Book("ISBN123", "Java Basics", true));
        lib.addBook(new Book("ISBN456", "Data Structures", false));

        System.out.println("Available books: " + lib.getTotalBooksCount());

      
        System.out.println("Available books: " + lib.getTotalBooksCount());
    }
}
