import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой");
        Book book = new Book(author, "Казаки", 1865);
        book.yearOfBookPublication = 1863;
        Author author1 = new Author("Александр", "Пушкин");
        Book book1 = new Book(author1, "Евгений Онегин", 1833);
        System.out.println(author);
        System.out.println(author1);
        System.out.println(book);
        System.out.println(book1);
    }
}
