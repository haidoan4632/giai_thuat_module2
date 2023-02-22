package ss7_abstract_class_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SocialBook extends Book implements ISocialBook {
    private String author;

    List<SocialBook[]> socialBookList = new ArrayList<SocialBook[]>();

    public SocialBook() {
    }


    public SocialBook(String nameBook, String publisher, String publishingYear, String author) {
        super(nameBook, publisher, publishingYear);
        this.author = author;
    }


    @Override
    public String toString() {
        return "SocialBook{" +
                "author='" + author + '\'' +
                "} " + super.toString();
    }

    @Override
    public void add(SocialBook[] socialBook) {
        socialBookList.add(socialBook);
    }

    @Override
    public void display() {
        for (SocialBook[] socialBook : socialBookList) {
            System.out.println(Arrays.toString(socialBook) +"\n");
        }
    }
}
