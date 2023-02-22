package ss7_abstract_class_interface;

public class main {
    public static void main(String[] args) {
        NaturalBook naturalBook = new NaturalBook();
        SocialBook socialBook = new SocialBook();
        NaturalBook[] naturalBooks = new NaturalBook[2];
        SocialBook[] socialBooks = new SocialBook[3];

        naturalBooks[0] = new NaturalBook("Đại số", "Giáo dục", "2000", "1000 quyển");
        naturalBooks[1] = new NaturalBook("Giải tích", "Giáo dục", "2005", "1500 quyển");
        naturalBook.add(naturalBooks);
        naturalBook.display();
        socialBooks[0] = new SocialBook("Chú bé đần", "Tuoi tre", "2010", "Thanh Hải");
        socialBooks[1] = new SocialBook("Chú bé thong minh", "Tuoi tre", "2015", "Thanh Hải");
        socialBooks[2] = new SocialBook("Chú bé vui ve", "Tuoi tre", "2020", "Thanh Hải");
        socialBook.add(socialBooks);
        socialBook.display();
    }
}
