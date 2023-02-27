package ss7edit_abstract_class_interface;

public class SocialBook extends Book {
    private String author;

    @Override
    public String toString() {
        return "SocialBook{" +
                "author='" + author + '\'' +
                "} " + super.toString();
    }
}
