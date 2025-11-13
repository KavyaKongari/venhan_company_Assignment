# Library Management System (Java)

This is a simple Java implementation of a library management system implementing the core features:

- Book management: add, update, remove books
- Borrower management: add, update, remove borrowers
- Borrowing & returning of books with due-date tracking and overdue detection
- Search books by title, author, or genre and show availability

## Structure

```
library-java/
  ├─ src/com/library/Book.java
  ├─ src/com/library/Borrower.java
  ├─ src/com/library/LoanRecord.java
  ├─ src/com/library/Library.java
  ├─ src/com/library/Main.java
  └─ README.md
```

## How to compile & run

From the `library-java` directory:

```bash
javac -d out src/com/library/*.java
java -cp out com.library.Main
```

This will compile and run the demo `Main` which demonstrates basic usage.
