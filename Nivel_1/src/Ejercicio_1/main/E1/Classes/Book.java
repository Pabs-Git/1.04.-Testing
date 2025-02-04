package E1.Classes;

public class Book implements Comparable<Book> {

    private String title;

    public Book(String title) {
        this.title = title;
    }
    public String getTitle() {

        return title;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
