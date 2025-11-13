package com.library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // Add books
        Book b1 = lib.addBook(\"The Hobbit\", \"J.R.R. Tolkien\", \"978-0007525492\", \"Fantasy\", 3);
        Book b2 = lib.addBook(\"1984\", \"George Orwell\", \"978-0451524935\", \"Dystopia\", 2);

        // Add borrowers
        Borrower alice = lib.addBorrower(\"Alice\", \"alice@example.com\", \"M001\");
        Borrower bob = lib.addBorrower(\"Bob\", \"bob@example.com\", \"M002\");

        System.out.println(\"Books in library:\");
        System.out.println(b1);
        System.out.println(b2);

        // Borrow a book
        lib.borrowBook(alice.getMembershipId(), b1.getId(), 14);
        System.out.println(\"Available copies of The Hobbit: \" + lib.availableCopies(b1.getId()));

        // Search by author
        List<Book> tolkien = lib.searchByAuthor(\"Tolkien\");
        System.out.println(\"Search by author 'Tolkien' -> \" + tolkien);

        // Return book
        lib.returnBook(alice.getMembershipId(), b1.getId());
        System.out.println(\"Available copies after return: \" + lib.availableCopies(b1.getId()));

        // List overdue (none)
        System.out.println(\"Overdue loans: \" + lib.listOverdue());
    }
}
