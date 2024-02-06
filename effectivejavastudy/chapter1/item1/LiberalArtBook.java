package effectivejavastudy.chapter1.item1;

public class LiberalArtBook implements BookInterface {

    @Override
    public Book create() {
        Book book = Book.of("LiberalArt", "LiberalArt", "LiberalArt");
        return book;
    }
}
