package Task3;

public class Title {
    private String namebook;

    Title (String name){
        super();
        this.namebook = name;
    }

    Title(){
    super();
    }

    public String getName() {
        return namebook;
    }

    public void setName(String name) {
        this.namebook = name;
    }

    void show(){
        System.out.println("Назва: " + namebook);
    }
}
