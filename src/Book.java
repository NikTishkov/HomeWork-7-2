import java.util.Objects;

public class Book {
    String nameBook;
    Author authorBook;
    int yearOfBookPublication;

    public Book(Author authorBook, String nameBook, int yearOfBookPublication) {
        this.authorBook = authorBook;
        this.nameBook = nameBook;
        this.yearOfBookPublication = yearOfBookPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getYearOfBookPublication() {
        return yearOfBookPublication;
    }

    public void setYearOfBookPublication(int yearOfBookPublication) {
        this.yearOfBookPublication = yearOfBookPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(authorBook);
    }

    @Override
    public String toString() {
        return "Book-" +
                "название книги: '" + nameBook + '\'' +
                ", " + authorBook +
                ", год публикации: " + yearOfBookPublication +
                '.';
    }
}
