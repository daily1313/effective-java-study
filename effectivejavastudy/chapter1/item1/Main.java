package effectivejavastudy.chapter1.item1;

public class Main {

    public static void main(String[] args) {
        // #1
        Book book1 = Book.of("title", "content", "author");
        Book book2 = Book.create("title", "content", "author");

        // #2
        BookSingleton s1 = BookSingleton.getSingleton();
        BookSingleton s2 = BookSingleton.getSingleton();

        System.out.println(s1 == s2);

        // #3
        BookInterface b1 = new MajorBook();
        Book majorBook = b1.create();

        BookInterface b2 = new LiberalArtBook();
        Book liberalArtBook = b2.create();

        System.out.println("majorBook = " + majorBook.getTitle());
        System.out.println("liberalArtBook = " + liberalArtBook.getTitle());

        // #4, #5
        Number positive = Positive.from(10);
        Number zero = Zero.from(0);
        Number negative = Negative.from(-10);
    }
}
