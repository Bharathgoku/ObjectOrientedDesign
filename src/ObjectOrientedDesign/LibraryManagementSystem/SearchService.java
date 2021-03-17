package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.enums.Category;
import java.time.LocalDate;
import java.util.List;

public interface SearchService {

    List<Book> searchByTitle(String titleName);

    List<Book> searchByAuthor(String authorName);

    List<Book> searchByCategory(Category category);

    List<Book> searchByPublicationDate(LocalDate localDate);

}
