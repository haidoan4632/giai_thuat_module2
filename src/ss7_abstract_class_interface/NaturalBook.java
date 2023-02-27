package ss7_abstract_class_interface;

import java.util.ArrayList;
import java.util.List;

public class NaturalBook extends Book implements INaturalBook {
    private String quantity;
    List<NaturalBook> naturalBookList = new ArrayList<NaturalBook>();
    public NaturalBook() {
    }
    public NaturalBook(String nameBook, String publisher, String publishingYear, String quantity) {
        super(nameBook, publisher, publishingYear);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "NaturalBook{" +
                "quantity='" + quantity + '\'' +
                " " + super.toString();
    }


    @Override
    public void add(NaturalBook naturalBook) {
        naturalBookList.add(naturalBook);
    }

    @Override
    public void display() {
        for (NaturalBook naturalBook : naturalBookList) {
            System.out.println(naturalBook.toString());
        }
    }
}
