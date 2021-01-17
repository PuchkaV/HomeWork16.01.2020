package Task3;
import java.util.Scanner;

public class Book {
    private Title title;
    private Author author;
    private Content content;

    public Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Book() {
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    void show(){
        title.show();
        author.show();
        content.show();
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Book book1 = new Book();
    System.out.println("Введіть назву книги: ");
    Title title1 = new Title(sc.nextLine());
    book1.setTitle(title1);
    System.out.println("Введіть назву автора: ");
    Author author1 = new Author(sc.nextLine());
    book1.setAuthor(author1);
    System.out.println("Введіть опис вмісту книги: ");
    Content content1 = new Content(sc.nextLine());
    book1.setContent(content1);
    book1.show();


    }

}

