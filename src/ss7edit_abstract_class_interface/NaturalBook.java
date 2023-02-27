package ss7edit_abstract_class_interface;

public class NaturalBook extends Book {
    private String quantity;

    @Override
    public String toString() {
        return "NaturalBook{" +
                "quantity='" + quantity + '\'' +
                "} " + super.toString();
    }
}
