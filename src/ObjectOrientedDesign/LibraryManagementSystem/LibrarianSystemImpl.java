package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;
import ObjectOrientedDesign.LibraryManagementSystem.enums.Category;
import java.time.LocalDate;
import java.util.List;

public class LibrarianSystemImpl implements LibrarianSystem{

    private SearchService searchService;

    @Override
    public Book addBook(Book book) {
        return null;
    }

    @Override
    public void removeBook(Book book) {

    }

    @Override
    public BookItem addBookItem(BookItem bookItem) {
        return null;
    }

    @Override
    public BookItem updateBookItem(BookItem bookItem) {
        return null;
    }

    @Override
    public void removeBookItem(BookItem bookItem) {

    }

    @Override
    public Member addMember(Member member) {
        return null;
    }

    @Override
    public Member blockMember(Integer memberId) {
        return null;
    }

    @Override
    public List<Book> searchByTitle(String titleName) {
        return searchService.searchByTitle(titleName);
    }

    @Override
    public List<Book> searchByAuthor(String authorName) {
        return searchService.searchByAuthor(authorName);
    }

    @Override
    public List<Book> searchByCategory(Category category) {
        return searchService.searchByCategory(category);
    }

    @Override
    public List<Book> searchByPublicationDate(LocalDate localDate) {
        return searchService.searchByPublicationDate(localDate);
    }
}
