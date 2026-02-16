package test3.libraryMangementSYsytem;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books = new HashMap<>();
    private int totalBooksCount = 0;

    public void addBook(Book b) {
        books.put(b.getIsbn(), b);
        if (b.isAvailable()) {
            totalBooksCount++;
        }
    }

    public int getTotalBooksCount() {
        return totalBooksCount;
    }

    public void borrowBook(String isbn) throws BookNotFoundException {

        Book b = books.get(isbn);

        if (b == null) {
            throw new BookNotFoundException("Book not found");
        }

        if (!b.isAvailable()) {
            throw new IllegalStateException("Book already borrowed");
        }

        b.setAvailable(false);
        totalBooksCount--;

        System.out.println("Borrowed: " + b.getTitle());
    }


}
