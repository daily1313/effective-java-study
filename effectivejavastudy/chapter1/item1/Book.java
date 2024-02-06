package effectivejavastudy.chapter1.item1;

public class Book {

    private String title;
    private String content;
    private String author;

    private Book(final String title, final String content, final String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public static Book create(final String title, final String content, final String author) {
        validate(title, content, author);
        return new Book(title, content, author);
    }

    public static Book of(final String title, final String content, final String author) {
        validate(title, content, author);
        return new Book(title, content, author);
    }

    private static void validate(final String title, final String content, final String author) {
        String regularExpression = "^[a-zA-Z]*$";

        if(!title.matches(regularExpression)) {
            throw new IllegalArgumentException();
        }

        if(!content.matches(regularExpression)) {
            throw new IllegalArgumentException();
        }

        if(!author.matches(regularExpression)) {
            throw new IllegalArgumentException();
        }
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
