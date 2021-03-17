package ObjectOrientedDesign.LibraryManagementSystem.entities;

import ObjectOrientedDesign.LibraryManagementSystem.enums.Category;
import ObjectOrientedDesign.LibraryManagementSystem.pojo.Rack;
import java.time.LocalDate;

public class Book {

  private String isbn;
  private String title;
  private String author;
  private String publisher;
  private String description;
  private LocalDate publicationDate;
  private Category category;
  private Rack rack;

  public Book() {
  }

  public Book(String isbn, String title, String author, String publisher, String description,
      LocalDate publicationDate, Category category,
      Rack rack) {
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.description = description;
    this.publicationDate = publicationDate;
    this.category = category;
    this.rack = rack;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(LocalDate publicationDate) {
    this.publicationDate = publicationDate;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Rack getRack() {
    return rack;
  }
}
