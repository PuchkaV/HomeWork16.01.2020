package Task3;

public class Content {
    private String data;

    public Content(String data) {
        this.data = data;
    }

    public Content() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    void show() {
        System.out.println("Опис: " + data);
    }

}
