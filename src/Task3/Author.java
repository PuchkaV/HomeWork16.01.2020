package Task3;

public class Author {
    private String nameAuthor;

    public Author(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public Author() {
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    void show(){
        System.out.println("Автор:  " + nameAuthor);
    }

}
