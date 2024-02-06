package effectivejavastudy.chapter1.item1;

public class MajorBook implements BookInterface {

    @Override
    public Book create() {
        Book book = Book.of("Major", "Major", "Major");
        return book;
    }
}
