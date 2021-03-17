package ObjectOrientedDesign.LibraryManagementSystem;

import ObjectOrientedDesign.LibraryManagementSystem.entities.Book;
import ObjectOrientedDesign.LibraryManagementSystem.enums.Category;
import java.time.LocalDate;
import java.util.List;

public class SearchServiceImpl implements SearchService{

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
