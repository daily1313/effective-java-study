package effectivejavastudy.chapter1.item1;

public class BookSingleton {

    private static BookSingleton singleton = null;

    private BookSingleton() {
    }

    public static BookSingleton getSingleton() {
        if(singleton == null) {
            singleton = new BookSingleton();
        }

        return singleton;
     }
}
