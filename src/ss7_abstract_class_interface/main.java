package ss7_abstract_class_interface;

public class main {
    public static void main(String[] args) {


        NaturalBook naturalBook = new NaturalBook();
        NaturalBook a = new NaturalBook("Đại số", "Giáo dục", "2000", "1000 quyển");
        NaturalBook b = new NaturalBook("Giải tích", "Giáo dục", "2005", "1500 quyển");
        naturalBook.add(a);
        naturalBook.add(b);
        naturalBook.display();

        SocialBook socialBook = new SocialBook();

        SocialBook c = new SocialBook("Chú bé đần", "Tuoi tre", "2010", "Thanh Hải");
        SocialBook d = new SocialBook("Chú bé thong minh", "Tuoi tre", "2015", "Thanh Hải");
        SocialBook e = new SocialBook("Chú bé vui ve", "Tuoi tre", "2020", "Thanh Hải");
        socialBook.add(c);
        socialBook.add(d);
        socialBook.add(e);
        socialBook.display();
    }
}
