package ss7_abstract_class_interface;

public class Book {
private String nameBook;
private String publisher;
private String publishingYear;

    public Book() {
    }

    public Book(String nameBook, String publisher, String publishingYear) {
        this.nameBook = nameBook;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                '}';
    }
}
