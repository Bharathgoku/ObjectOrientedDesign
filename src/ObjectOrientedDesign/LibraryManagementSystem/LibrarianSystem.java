package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;

public interface LibrarianSystem extends SearchService {

    Book addBook(Book book);

    void removeBook(Book book);

    BookItem addBookItem(BookItem bookItem);

    BookItem updateBookItem(BookItem bookItem);

    void removeBookItem(BookItem bookItem);

    Member addMember(Member member);

    Member blockMember(Integer memberId);

}
