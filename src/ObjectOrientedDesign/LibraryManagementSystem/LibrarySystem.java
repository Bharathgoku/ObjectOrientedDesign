package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.entities.BookItem;
import ObjectOrientedDesign.LibraryManagementSystem.entities.Member;
import ObjectOrientedDesign.LibraryManagementSystem.enums.Category;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.BookingService;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.FineService;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.InventoryService;
import ObjectOrientedDesign.LibraryManagementSystem.services.interfaces.MemberService;
import java.time.LocalDate;
import java.util.List;

public class LibrarySystem implements LibrarianSystem, MemberSystem{

    private InventoryService inventoryService;
    private MemberService memberService;
    private BookingService bookingService;
    private FineService fineService;

    @Override
    public Book addBook(Book book) {
        book = inventoryService.addBook(book);
        return book;
    }

    @Override
    public void removeBook(Book book) {
        inventoryService.removeBook(book);
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
        member = memberService.addMember(member);
        return member;
    }

    @Override
    public Member blockMember(Integer memberId) {
        Member member = memberService.blockMember(memberId);
        return member;
    }

    // checkout flow
    @Override
    public BookItem checkoutBookItem(BookItem bookItem) {
        return null;
    }

    // reserve book flow
    @Override
    public Book reserveABook(Book book) {
        return null;
    }

    // return book flow
    @Override
    public void returnBookItem(BookItem bookItem){
    }

    // renew book flow
    @Override
    public BookItem renewBookItem(BookItem bookItem) {
        return null;
    }

    @Override
    public List<Book> searchByTitle(String titleName) {
        return null;
    }

    @Override
    public List<Book> searchByAuthor(String authorName) {
        return null;
    }

    @Override
    public List<Book> searchByCategory(Category category) {
        return null;
    }

    @Override
    public List<Book> searchByPublicationDate(LocalDate localDate) {
        return null;
    }
}
