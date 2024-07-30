public class LibraryManagementSystem {
    private Book[] books;

    public LibraryManagementSystem(Book[] books) {
        this.books = books;
    }

    // Linear search to find books by title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search to find books by title (assuming the list is sorted)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Main method to test the search methods
    public static void main(String[] args) {
        Book[] books = {
                new Book("B001", "The Catcher in the Rye", "J.D. Salinger"),
                new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
                new Book("B003", "1984", "George Orwell"),
                new Book("B004", "Pride and Prejudice", "Jane Austen"),
                new Book("B005", "The Great Gatsby", "F. Scott Fitzgerald")
        };

        // Assuming books array is sorted by title
        LibraryManagementSystem library = new LibraryManagementSystem(books);

        // Linear Search Test
        System.out.println("Linear Search Test:");
        Book book1 = library.linearSearchByTitle("1984");
        System.out.println(book1 != null ? book1 : "Book not found.");

        // Binary Search Test
        System.out.println("\nBinary Search Test:");
        Book book2 = library.binarySearchByTitle("Pride and Prejudice");
        System.out.println(book2 != null ? book2 : "Book not found.");
    }
}
