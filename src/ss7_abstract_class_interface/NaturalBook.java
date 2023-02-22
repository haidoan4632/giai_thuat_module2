package ss7_abstract_class_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaturalBook extends Book implements INaturalBook {
    private String quantity;
    List<NaturalBook[]> naturalBookList = new ArrayList<NaturalBook[]>();
    private NaturalBook naturalBook;

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
                ", naturalBookList=" + naturalBookList +
                "} " + super.toString();
    }


    @Override
    public void add(NaturalBook[] naturalBook) {
        naturalBookList.add(naturalBook);
    }

    @Override
    public void display() {
        this.naturalBook = naturalBook;
        for (NaturalBook[] naturalBook1 : naturalBookList) {
            System.out.println(Arrays.toString(naturalBook1) + "\n");
        }
    }
}
