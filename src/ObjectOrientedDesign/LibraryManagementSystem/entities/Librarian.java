package ObjectOrientedDesign.LibraryManagementSystem.entities;

public class Librarian extends Account {

  private String librarianId;
  private Library library;

  public Librarian(Integer id, String email, String password, String name,
      String librarianId) {
    super(id, email, password, name);
    this.librarianId = librarianId;
  }
}
