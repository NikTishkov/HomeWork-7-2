import java.util.Objects;

public class Author {
    String firstNameAuthor;
    String surNameAuthor;

    public Author(String firstNameAuthor, String surNameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.surNameAuthor = surNameAuthor;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public String getSurNameAuthor() {
        return surNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstNameAuthor, author.firstNameAuthor) && Objects.equals(surNameAuthor, author.surNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, surNameAuthor);
    }

    @Override
    public String toString() {
        return "Автор:" +
                " Имя автора-'" + firstNameAuthor + '\'' +
                ", Фамилия автора-'" + surNameAuthor + '\'' +
                '.';
    }
}
